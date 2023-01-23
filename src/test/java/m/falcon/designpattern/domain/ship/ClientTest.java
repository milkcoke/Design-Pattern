package m.falcon.designpattern.domain.ship;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    private Client client = new Client("카르마", "karma@gmail.com");

    @DisplayName("클라이언트 메소드를 통한 생성자 의존성 주입")
    @Test
    void clientOrderDiTest() {
        assertThrows(IllegalArgumentException.class, ()->client.orderShip(new BlackShipFactory(), "blackship"));
        Ship blackShip = client.orderShip(new BlackShipFactory(), "black-ship");
        assertThat(blackShip.getColor()).isEqualTo("black");
    }
}