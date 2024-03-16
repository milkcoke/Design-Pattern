package m.falcon.designpattern.behavior.chainofresponsibility2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginLoggingHandler extends AbstractLoginRequestHandler implements LoginRequestHandler {
  public LoginLoggingHandler(LoginRequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void doHandle(LoginRequest request) {
    log.info("ID: " +  request.id() + " is created");
  }
}
