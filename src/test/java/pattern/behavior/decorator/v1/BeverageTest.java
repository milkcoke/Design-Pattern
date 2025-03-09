package pattern.behavior.decorator.v1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pattern.structure.decorator.v1.Beverage;
import pattern.structure.decorator.v1.beverage.Espresso;
import pattern.structure.decorator.v1.decorator.Mocha;

import static org.assertj.core.api.Assertions.assertThat;

class BeverageTest {

  @DisplayName("커피 주문 통합 테스트")
  @Test
  void starbuzzTest() {
    // given
    Beverage beverage = new Espresso();
    assertThat(beverage.cost()).isEqualTo(1.99);
    assertThat(beverage.getDescription()).isEqualTo("에스프레소");

    Beverage mochaEspresso = new Mocha(beverage);
    assertThat(mochaEspresso.cost()).isEqualTo(2.19);
    assertThat(mochaEspresso.getDescription()).isEqualTo("에스프레소, 모카");

    Beverage doubleMochaEspresso = new Mocha(mochaEspresso);
    assertThat(doubleMochaEspresso.cost()).isEqualTo(2.39);
    assertThat(doubleMochaEspresso.getDescription()).isEqualTo("에스프레소, 모카, 모카");
  }

}
