package pattern.behavior.chainofresponsibility.v1;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Client {

    private final RequestHandler requestHandler;

    public void validateRequest(Request request) {
        this.requestHandler.handle(request);
    }
}
