package m.falcon.designpattern.behaviorpattern.chainofresponsibilitypattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class RequestHandler {
    private final RequestHandler nextHandler;

    public void handle(Request request) {
        if (this.nextHandler == null) return;
        this.nextHandler.handle(request);
    }
}
