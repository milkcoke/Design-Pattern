package pattern.behavior.decorator.v1.beverage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pattern.structure.decorator.v1.Beverage;
import pattern.structure.decorator.v1.beverage.DarkRoast;
import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.policy.FixedDarkRoastPricingPolicy;

import static org.assertj.core.api.Assertions.assertThat;

class DarkRoastTest {
  @DisplayName("Should return according to size of the beverage")
  @Test
  void getTallSizePrice() {
    // given
    Beverage tallDarkRoast = new DarkRoast(BeverageSize.TALL, new FixedDarkRoastPricingPolicy());
    // when then
    assertThat(tallDarkRoast.cost()).isEqualTo(0.99);
  }

  @DisplayName("Should return according to size of the beverage grande")
  @Test
  void getGrandeSizeTest() {
    // given
    Beverage grandeDarkRoast = new DarkRoast(BeverageSize.GRANDE, new FixedDarkRoastPricingPolicy());
    // when then
    assertThat(grandeDarkRoast.cost()).isEqualTo(1.09);
  }
}
