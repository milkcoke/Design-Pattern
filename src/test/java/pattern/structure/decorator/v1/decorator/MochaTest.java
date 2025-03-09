package pattern.structure.decorator.v1.decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pattern.structure.decorator.v1.CondimentDecorator;
import pattern.structure.decorator.v1.beverage.DarkRoast;

import static org.assertj.core.api.Assertions.assertThat;

class MochaTest {

  @DisplayName("Mocha getDescription with its simpleName")
  @Test
  void abstractMethodTest() {
    // given
    CondimentDecorator mocha = new Mocha(new DarkRoast());
    // when then
    assertThat(mocha.getDescription()).isEqualTo("다크 로스트, 모카");
  }

}
