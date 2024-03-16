package m.falcon.designpattern.behavior.chainofresponsibility3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class LoginLoggingHandler extends AbstractLoginRequestHandler implements LoginRequestHandler {

  @Override
  public void doHandle(LoginRequest request) {
    log.info("ID: " +  request.id() + " is created");
  }
}
