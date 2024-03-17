package pattern.behavior.strategy.tobe.customer;

import pattern.behavior.strategy.domain.PurchaseHistory;

public class GoldCustomerPurchaseRule implements CustomerRule {
  private final int TOTAL_AMOUNT = 1_000_000;
  @Override
  public boolean ok(PurchaseHistory history) {
    return TOTAL_AMOUNT <= history.getTotalAmount();
  }
}
