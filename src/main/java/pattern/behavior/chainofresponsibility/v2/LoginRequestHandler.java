package pattern.behavior.chainofresponsibility.v2;

public interface LoginRequestHandler {
  void doHandle(LoginRequest request);
}
