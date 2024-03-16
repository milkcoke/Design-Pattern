package m.falcon.designpattern.behavior.chainofresponsibility3;

class LoginRequestRangeHandler extends AbstractLoginRequestHandler implements LoginRequestHandler {
  private final int MIN_LENGTH_ID = 3;
  private final int MIN_LENGTH_PASSWORD = 5;

  /**
   * Validate login ID and Password range
   * @throws IllegalArgumentException ID or Password are blank
   */
  @Override
  public void doHandle(LoginRequest request) {
    String id = request.id();
    String password = request.password();
    if (id.isBlank()) throw new IllegalArgumentException("Login id should be input");
    if (id.length() < MIN_LENGTH_ID) throw new IllegalArgumentException("ID should be greater or equal to the 3");
    if (password.isBlank()) throw new IllegalArgumentException("Login password should be input");
    if (password.length() < MIN_LENGTH_PASSWORD) throw new IllegalArgumentException("ID should be greater or equal to the 5");

    super.doNext(request);
  }
}
