package pattern.behavior.chainofresponsibility.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * Create login request handler in order
 */
class LoginRequestChain {
  private LoginRequestChain() {}
  public static Builder builder() {
    return new Builder();
  }
  /**
   * Create first request handler which has next handler
   */
  static class Builder {
    private final List<AbstractLoginRequestHandler> handlers = new ArrayList<>();

    public Builder addHandler(AbstractLoginRequestHandler requestHandler) {
      handlers.add(requestHandler);
      return this;
    }

    /**
     * @return {@code LoginRequestHandler} First element of the chain
     * @throws IllegalStateException if no request handler is provided
     */
    public LoginRequestHandler build() {
      if (handlers.isEmpty()) throw new IllegalStateException("Should pass at least one request handler");

      for (int idx = handlers.size() - 1; idx > 0; idx--) {
        AbstractLoginRequestHandler currentHandler = handlers.get(idx);
        AbstractLoginRequestHandler prevHandler = handlers.get(idx - 1);
        prevHandler.setNextHandler(currentHandler);
      }

      return this.handlers.get(0);
    }
  }
}
