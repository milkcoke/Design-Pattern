package pattern.create.domain.ship;

import pattern.create.factory.v1.BlackShipFactory;
import pattern.create.factory.v1.WhiteShipFactory;
import pattern.create.factory.v1.BlackShipNormalPartsFactory;
import pattern.create.factory.v1.WhiteShipNormalPartsFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShipTest {

    private final Client client = new Client("카르마", "karma@gmail.com");
    @DisplayName("팩토리를 통한 배 생성")
    @Test
    void createShipTest() {
        // 사실 여기서 클라이언트 코드는 변경됨.
        // 그래서 의존성 주입을 통해 이 문제를 해결함. => 최대한 클라이언트 코드 변경을 줄일 수 있음.
        Ship whiteShip = new WhiteShipFactory(new WhiteShipNormalPartsFactory()).create();
        Ship blackShip = new BlackShipFactory(new BlackShipNormalPartsFactory()).create();
    }

    @DisplayName("배 이름 유효성 검사")
    @Test
    void invalidShipNameTest() {
        assertThrows(IllegalArgumentException.class, () -> new WhiteShipFactory(new WhiteShipNormalPartsFactory()).orderShip(client, "whitefactory"));
        assertThrows(IllegalArgumentException.class, () -> new BlackShipFactory(new BlackShipNormalPartsFactory()).orderShip(client, "blackFactory"));
    }

    @DisplayName("유효한 배 주문")
    @Test
    void validShipOrderTest() {
        Ship whiteShip = new WhiteShipFactory(new WhiteShipNormalPartsFactory()).orderShip(client, "white-ship");
        Ship blackShip = new BlackShipFactory(new BlackShipNormalPartsFactory()).orderShip(client, "black-ship");
        assertThat(whiteShip.getColor()).isEqualTo("White");
        assertThat(blackShip.getColor()).isEqualTo("Black");
    }

}
