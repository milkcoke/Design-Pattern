package m.falcon.designpattern.behavior.strategy.asis.customer;

import m.falcon.designpattern.behavior.strategy.domain.PurchaseHistory;

public class CustomerGradeChecker {
  static final int GOLD_TOTAL_AMOUNT = 1_000_000;
  static final int MONTH_TOTAL_PURCHASE = 10;
  static final double RETURN_RATE = 0.1;
  boolean isGoldCustomer(PurchaseHistory purchaseHistory) {
    if (GOLD_TOTAL_AMOUNT < purchaseHistory.getTotalAmount()) return false;
    if (MONTH_TOTAL_PURCHASE > purchaseHistory.getPurchaseFrequencyPerMonth()) return false;
    if (RETURN_RATE <= purchaseHistory.getReturnRate()) return false;
    return true;
  }

  boolean isSilverCustomer(PurchaseHistory purchaseHistory) {
    if (MONTH_TOTAL_PURCHASE > purchaseHistory.getPurchaseFrequencyPerMonth()) return false;
    if (RETURN_RATE <= purchaseHistory.getReturnRate()) return false;
    return true;
  }
}
