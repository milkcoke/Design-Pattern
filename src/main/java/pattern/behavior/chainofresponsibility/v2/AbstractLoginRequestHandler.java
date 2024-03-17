package pattern.behavior.chainofresponsibility.v2;

import lombok.RequiredArgsConstructor;

/**
 * Chaining all request handlers
 * Child request handler should not know next request handler
 */
@RequiredArgsConstructor
abstract class AbstractLoginRequestHandler implements LoginRequestHandler {
  private final LoginRequestHandler nextHandler;

  // TODO: Chain multiple request handlers
  //   어쨌든 다음 RequestHandler 에 대한 정보는 쥐고 있어야함.
  //   여기서 모두 강제할 수는 없다.

  protected void doNext(LoginRequest loginRequest) {
    if (this.nextHandler == null) return;
    this.nextHandler.doHandle(loginRequest);
  }
}
