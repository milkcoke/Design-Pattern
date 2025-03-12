package pattern.structure.decorator.v2.beverage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pattern.structure.decorator.v2.Beverage;
import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.SizePricingPolicy;
import pattern.structure.decorator.v2.policy.FixedDarkRoastPricingPolicy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static pattern.structure.decorator.v2.BeverageSize.*;

class DarkRoastTest {

  @DisplayName("Default Pricing policy should be fixed")
  @Test
  void withDefaultPolicy() {
    Beverage darkRoastTall = DarkRoast.withDefaultPolicy(TALL);
    assertThat(darkRoastTall.cost()).isEqualTo(0.99);
  }

  @DisplayName("price should be decided by size")
  @Test
  void of() {
    SizePricingPolicy policy = FixedDarkRoastPricingPolicy.getInstance();
    Beverage darkRoastTall = DarkRoast.of(TALL, policy);
    Beverage darkRoastGrande = DarkRoast.of(GRANDE, policy);
    Beverage darkRoastVenti = DarkRoast.of(VENTI, policy);

    assertThat(darkRoastTall.cost()).isEqualTo(0.99);
    assertThat(darkRoastGrande.cost()).isEqualTo(1.09);
    assertThat(darkRoastVenti.cost()).isEqualTo(1.19);
  }
}
