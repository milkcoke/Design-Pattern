package pattern.behavior.strategy.tobe.customer;

import pattern.behavior.strategy.domain.PurchaseHistory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerPolicyTest {

  @DisplayName("Should be gold policy canBeByHistory when history meets total amount, frequency, returnRate")
  @Test
  void canBeByHistoryGoldCustomer() {
    // given
    PurchaseHistory history = new PurchaseHistory(1_000_000, 30, 0.00001);

    CustomerPolicy goldCustomerPolicy = new GoldCustomerPolicy();
    CustomerPolicy silverCustomerPolicy = new SilverCustomerPolicy();

    // when then
    assertThat(goldCustomerPolicy.complyByHistory(history)).isTrue();
    assertThat(silverCustomerPolicy.complyByHistory(history)).isTrue();
  }

  @DisplayName("Should be silver policy canBeByHistory when history meets total amount, frequency, returnRate")
  @Test
  void canBeByHistorySilverCustomer() {
    // given
    PurchaseHistory history = new PurchaseHistory(1_000, 30, 0.00001);

    CustomerPolicy goldCustomerPolicy = new GoldCustomerPolicy();
    CustomerPolicy silverCustomerPolicy = new SilverCustomerPolicy();

    // when then
    assertThat(goldCustomerPolicy.complyByHistory(history)).isFalse();
    assertThat(silverCustomerPolicy.complyByHistory(history)).isTrue();
  }
}
