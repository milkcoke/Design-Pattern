package pattern.structure.decorator.v2.beverage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pattern.structure.decorator.v2.Beverage;
import pattern.structure.decorator.v2.BeverageSize;

import static org.assertj.core.api.Assertions.assertThat;

class DecafTest {

  @DisplayName("Should be decided price according to size")
  @Test
  void cost() {
    // given
    Beverage decafTall = Decaf.withDefaultPolicy(BeverageSize.TALL);
    Beverage decafGrande = Decaf.withDefaultPolicy(BeverageSize.GRANDE);

    // when
    assertThat(decafGrande.cost()).isGreaterThan(decafTall.cost());
  }
}
