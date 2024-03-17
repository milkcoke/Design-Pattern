package pattern.behavior.strategy.tobe.customer;

import pattern.behavior.strategy.domain.PurchaseHistory;

public interface CustomerPolicy {
  boolean complyByHistory(PurchaseHistory history);
}
