package pattern.behavior.strategy.tobe.customer;

import pattern.behavior.strategy.domain.PurchaseHistory;

public class PurchaseFrequencyRule implements CustomerRule {
  private final int MONTH_FREQUENCY = 10;

  @Override
  public boolean ok(PurchaseHistory history) {
    return MONTH_FREQUENCY <= history.getPurchaseFrequencyPerMonth();
  }
}
