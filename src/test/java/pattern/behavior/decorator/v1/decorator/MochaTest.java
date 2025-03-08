package pattern.behavior.decorator.v1.decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pattern.behavior.decorator.v1.CondimentDecorator;
import pattern.behavior.decorator.v1.beverage.DarkRoast;

import static org.assertj.core.api.Assertions.assertThat;

class MochaTest {

  @DisplayName("Mocha getDescription with its simpleName")
  @Test
  void abstractMethodTest() {
    // given
    CondimentDecorator mocha = new Mocha(new DarkRoast());
    // when then
    assertThat(mocha.getDescription()).isEqualTo("DarkRoast, Mocha");
  }

}
