package pattern.structure.decorator.v2.decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pattern.structure.decorator.v2.Beverage;
import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.CondimentDecorator;
import pattern.structure.decorator.v2.beverage.Espresso;
import pattern.structure.decorator.v2.policy.FixedEspressoPricingPolicy;
import pattern.structure.decorator.v2.policy.MochaPricingPolicy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MochaTest {

  @DisplayName("Mocha cost should be sum of beverage and itself according to the size")
  @Test
  void cost() {
    // given
    Beverage espresso = Espresso.from(FixedEspressoPricingPolicy.getInstance());
    CondimentDecorator mocha = Mocha.create(espresso, new MochaPricingPolicy());
    CondimentDecorator doubleMocha = Mocha.create(mocha, new MochaPricingPolicy());
    // when
    assertThat(doubleMocha.getSize()).isEqualTo(espresso.getSize());
    assertThat(doubleMocha.cost()).isEqualTo(espresso.cost() + 0.20 + 0.20);
  }
}
