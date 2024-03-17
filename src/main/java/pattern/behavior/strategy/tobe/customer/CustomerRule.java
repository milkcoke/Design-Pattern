package pattern.behavior.strategy.tobe.customer;

import pattern.behavior.strategy.domain.PurchaseHistory;

public interface CustomerRule {
  boolean ok(final PurchaseHistory history);
}
