package pattern.behavior.chainofresponsibility3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pattern.behavior.chainofresponsibility3.*;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LoginRequestChainTest {

  @DisplayName("Create with chain builder")
  @Test
  void chainBuilderTest() {
    // given
    LoginRequestHandler chain = LoginRequestChain.builder()
      .addHandler(new LoginRequestRangeHandler())
      .addHandler(new LoginRequestPolicyHandler())
      .addHandler(new LoginLoggingHandler())
      .build();

    // when then
    chain.doHandle(new LoginRequest("GoodId", "GoodPassword"));
  }

  @DisplayName("Should pass at least one request handler when creating chain")
  @Test
  void failedToNoHandler() {
    assertThatThrownBy(()-> LoginRequestChain.builder().build())
      .isInstanceOf(IllegalStateException.class)
      .hasMessage("Should pass at least one request handler");
  }
}
