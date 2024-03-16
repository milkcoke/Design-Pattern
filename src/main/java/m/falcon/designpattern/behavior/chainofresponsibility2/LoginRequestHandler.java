package m.falcon.designpattern.behavior.chainofresponsibility2;

public interface LoginRequestHandler {
  void doHandle(LoginRequest request);
}
