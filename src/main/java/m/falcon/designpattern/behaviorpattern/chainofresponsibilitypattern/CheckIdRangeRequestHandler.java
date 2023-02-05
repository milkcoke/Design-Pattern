package m.falcon.designpattern.behaviorpattern.chainofresponsibilitypattern;

public class CheckIdRangeRequestHandler extends RequestHandler {
    public CheckIdRangeRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        var id = request.getId();
        if (id <= 0 || id >= 10) throw new IllegalArgumentException("Request Id should be in [1,10]");

        super.handle(request);
    }
}
