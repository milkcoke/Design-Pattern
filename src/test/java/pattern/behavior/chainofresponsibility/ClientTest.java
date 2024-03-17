package pattern.behavior.chainofresponsibility;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pattern.behavior.chainofresponsibility.*;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    private final RequestHandler chainHandler = new CheckIdRangeRequestHandler(new CheckLengthRequestHandler(new LoggingRequestHandler(null)));
    @DisplayName("Success request")
    @Test
    void successRequestHandleTest() {
        Request request = new Request(5, "khazix");
        Client client = new Client(chainHandler);
        client.validateRequest(request);
    }

    @DisplayName("ID 범위 실패 테스트")
    @Test
    void failCheckIdRangeHandle() {
        Request request = new Request(0, "khazix");
        Client client = new Client(chainHandler);
        assertThrows(IllegalArgumentException.class, ()->client.validateRequest(request));
    }


    @DisplayName("Body 길이 범위 실패 테스트")
    @Test
    void failCheckBodyLengthHandle() {
        Request request = new Request(0, "khazix vladimir rumble");
        Client client = new Client(chainHandler);
        assertThrows(IllegalArgumentException.class, ()->client.validateRequest(request));
    }
}
