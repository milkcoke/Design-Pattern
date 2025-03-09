package pattern.structure.decorator.v2.beverage;

import org.junit.jupiter.api.Test;
import pattern.structure.decorator.v2.Beverage;
import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.policy.FixedHouseBlendPricingPolicy;

import static org.assertj.core.api.Assertions.assertThat;

class HouseBlendTest {

  @Test
  void of() {
    Beverage houseBlend = HouseBlend.of(BeverageSize.TALL, FixedHouseBlendPricingPolicy.getInstance());
    assertThat(houseBlend.cost()).isEqualTo(0.89);
  }
}
