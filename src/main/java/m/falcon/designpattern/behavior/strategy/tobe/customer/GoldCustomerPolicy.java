package m.falcon.designpattern.behavior.strategy.tobe.customer;


import java.util.List;

public class GoldCustomerPolicy extends AbstractCustomerPolicy implements CustomerPolicy {
  public GoldCustomerPolicy() {
    super(List.of(
        new GoldCustomerPurchaseRule(),
        new PurchaseFrequencyRule(),
        new ReturnRateRule()
    ));
  }
}
