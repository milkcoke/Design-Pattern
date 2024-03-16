package m.falcon.designpattern.behavior.chainofresponsibility3;

import lombok.Setter;

/**
 * Chaining all request handlers
 * Child request handler should not know next request handler
 */
@Setter
abstract class AbstractLoginRequestHandler implements LoginRequestHandler {
  private LoginRequestHandler nextHandler;

  protected void doNext(LoginRequest loginRequest) {
    if (this.nextHandler == null) return;
    this.nextHandler.doHandle(loginRequest);
  }
}
