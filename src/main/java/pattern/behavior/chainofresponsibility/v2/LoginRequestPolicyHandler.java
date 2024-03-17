package pattern.behavior.chainofresponsibility.v2;

/**
 * Validate ID and Password according to login policy
 */

public class LoginRequestPolicyHandler extends AbstractLoginRequestHandler implements LoginRequestHandler {

  LoginRequestPolicyHandler(LoginRequestHandler request) {
    super(request);
  }

  /**
   * @param request LoginRequest input
   * @throws IllegalArgumentException The ID and password should not be the same.
   */
  @Override
  public void doHandle(LoginRequest request) {
    if (request.id().equals(request.password())) {
      throw new IllegalArgumentException("Should not be same between ID and Password");
    }

    super.doNext(request);
  }
}
