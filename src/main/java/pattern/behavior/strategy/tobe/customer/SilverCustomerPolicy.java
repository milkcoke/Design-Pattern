package pattern.behavior.strategy.tobe.customer;

import java.util.List;

public class SilverCustomerPolicy extends AbstractCustomerPolicy implements CustomerPolicy {
  public SilverCustomerPolicy() {
    super(List.of(new PurchaseFrequencyRule(), new ReturnRateRule()));
  }
}
