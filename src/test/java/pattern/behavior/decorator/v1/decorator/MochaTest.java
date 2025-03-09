package pattern.behavior.decorator.v1.decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pattern.structure.decorator.v1.decorator.Mocha;
import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v1.CondimentDecorator;
import pattern.structure.decorator.v1.beverage.DarkRoast;
import pattern.structure.decorator.v2.policy.FixedDarkRoastPricingPolicy;

import static org.assertj.core.api.Assertions.assertThat;

class MochaTest {

  @DisplayName("Mocha getDescription with its simpleName")
  @Test
  void abstractMethodTest() {
    // given
    CondimentDecorator mocha = new Mocha(new DarkRoast(BeverageSize.GRANDE, new FixedDarkRoastPricingPolicy()));
    // when then
    assertThat(mocha.getDescription()).isEqualTo("DarkRoast, Mocha");
  }

}
