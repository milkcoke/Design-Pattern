package m.falcon.designpattern.behavior.strategy.tobe.customer;

import m.falcon.designpattern.behavior.strategy.domain.PurchaseHistory;

public interface CustomerRule {
  boolean ok(final PurchaseHistory history);
}
