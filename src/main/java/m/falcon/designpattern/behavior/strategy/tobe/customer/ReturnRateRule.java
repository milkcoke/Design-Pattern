package m.falcon.designpattern.behavior.strategy.tobe.customer;

import m.falcon.designpattern.behavior.strategy.domain.PurchaseHistory;

public class ReturnRateRule implements CustomerRule {
  private final double RETURN_RATE = 0.001;
  @Override
  public boolean ok(PurchaseHistory history) {
    return RETURN_RATE >= history.getReturnRate();
  }
}
