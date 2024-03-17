package pattern.behavior.strategy.tobe.customer;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import pattern.behavior.strategy.domain.PurchaseHistory;

import java.util.List;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class AbstractCustomerPolicy implements CustomerPolicy {
  private final List<CustomerRule> customerRuleList;

  @Override
  public boolean complyByHistory(PurchaseHistory history) {
    return this.customerRuleList
        .stream()
        .allMatch(customerRule -> customerRule.ok(history));
  }
}
