package pattern.behavior.chainofresponsibility.v2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AbstractRequestHandlerTest {

  @DisplayName("Decide chain on client side two")
  @Test
  void emptyIdTest() {
    // given
    LoginRequest request = new LoginRequest("", "pw");
    LoginRequestHandler loginRequestHandler = new LoginRequestRangeHandler(new LoginRequestPolicyHandler(new LoginLoggingHandler(null)));

    // when // then
    Assertions.assertThatThrownBy(()-> loginRequestHandler.doHandle(request))
      .isInstanceOf(IllegalArgumentException.class)
      .hasMessage("Login id should be input");
  }

  @DisplayName("Should not be same each other that ID and Password")
  @Test
  void sameIdPwTest() {
    // given
    LoginRequest request = new LoginRequest("samestring", "samestring");
    LoginRequestHandler loginRequestHandler = new LoginRequestRangeHandler(new LoginRequestPolicyHandler(new LoginLoggingHandler(null)));

    // when // then
    Assertions.assertThatThrownBy(()-> loginRequestHandler.doHandle(request))
      .isInstanceOf(IllegalArgumentException.class)
      .hasMessage("Should not be same between ID and Password");
  }

  @DisplayName("Should logging when success to lgin")
  @Test
  void successLoginTest() {
    // given
    LoginRequest request = new LoginRequest("good_id", "good_password");
    LoginRequestHandler loginRequestHandler = new LoginRequestRangeHandler(new LoginRequestPolicyHandler(new LoginLoggingHandler(null)));

    // when // then
    loginRequestHandler.doHandle(request);
  }
}
