package pattern.create.domain.ship;

import pattern.create.factory.BlackShipFactory;
import pattern.create.factory.BlackShipNormalPartsFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    private Client client = new Client("카르마", "karma@gmail.com");

    @DisplayName("클라이언트 메소드를 통한 생성자 의존성 주입 테스트")
    @Test
    void clientOrderDiTest() {
        Ship blackOrderedShip = client.orderShip(new BlackShipFactory(new BlackShipNormalPartsFactory()), "black-ship");
        Ship blackship = new BlackShipFactory(new BlackShipNormalPartsFactory()).create();
        assertThat(blackOrderedShip.getColor()).isEqualTo("Black");
        assertThat(blackship.getClass().getSimpleName()).isEqualTo("BlackShip");
    }

    @DisplayName("클라이언트 주문 실패 테스트")
    @Test
    void clientOrderFailTest() {
        assertThrows(IllegalArgumentException.class, ()->client.orderShip(new BlackShipFactory(new BlackShipNormalPartsFactory()), "blackship"));
    }
}
