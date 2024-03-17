package pattern.behavior.chainofresponsibility.v3;

interface LoginRequestHandler {
  void doHandle(LoginRequest request);
}
