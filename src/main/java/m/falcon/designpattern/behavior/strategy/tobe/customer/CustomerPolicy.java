package m.falcon.designpattern.behavior.strategy.tobe.customer;

import m.falcon.designpattern.behavior.strategy.domain.PurchaseHistory;

public interface CustomerPolicy {
  boolean complyByHistory(PurchaseHistory history);
}
