package pattern.behavior.chainofresponsibility.v1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingRequestHandler extends RequestHandler{
    public LoggingRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle(Request request) {
        log.info("request id: " + request.getId());
        log.info("body: " + request.getBody());
        super.handle(request);
    }
}
