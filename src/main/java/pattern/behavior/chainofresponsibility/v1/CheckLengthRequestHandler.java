package pattern.behavior.chainofresponsibility.v1;

public class CheckLengthRequestHandler extends RequestHandler {
    public CheckLengthRequestHandler(RequestHandler nextRequestHandler) {
        super(nextRequestHandler);
    }

    @Override
    public void handle(Request request) {
        if (request.getBody().length() > 10) {
            throw new IllegalArgumentException("You should request body length <= 10");
        }
        super.handle(request);
    }
}
