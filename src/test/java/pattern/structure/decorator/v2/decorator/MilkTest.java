package pattern.structure.decorator.v2.decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pattern.structure.decorator.v2.Beverage;
import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.CondimentDecorator;
import pattern.structure.decorator.v2.beverage.DarkRoast;
import pattern.structure.decorator.v2.policy.MilkPricingPolicy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MilkTest {

  @DisplayName("The price should follow beverage size and milk also")
  @Test
  void cost() {
    // given
    Beverage darkRoast = DarkRoast.withDefaultPolicy(BeverageSize.GRANDE);
    CondimentDecorator milk = Milk.create(darkRoast, new MilkPricingPolicy());
    // when
    assertThat(milk.getSize()).isSameAs(BeverageSize.GRANDE);
    assertThat(milk.cost()).isEqualTo(darkRoast.cost() + 0.15);
  }
}
