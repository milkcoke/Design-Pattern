package m.falcon.designpattern.behaviorpattern.chainofresponsibilitypattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Client {

    private final RequestHandler requestHandler;

    public void validateRequest(Request request) {
        this.requestHandler.handle(request);
    }
}
