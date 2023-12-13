package m.falcon.designpattern.behavior.strategy.tobe;

import m.falcon.designpattern.behavior.strategy.tobe.light.BlueLightRedLight;
import m.falcon.designpattern.behavior.strategy.tobe.light.FastestSpeedStrategy;
import m.falcon.designpattern.behavior.strategy.tobe.light.NormalSpeedStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BlueLightRedLightTest {
  @DisplayName("Normal strategy BlueLightRedLight")
  @Test
  void normalVersion() {
    // given
    BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new NormalSpeedStrategy());
    // when
    blueLightRedLight.blueLight(); // 무  궁   화 꽃   이
    blueLightRedLight.redLight(); // 피 었 습 니 다.
  }

  @DisplayName("Normal strategy BlueLightRedLight")
  @Test
  void fastestVersion() {
    // given
    BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new FastestSpeedStrategy());
    // when
    blueLightRedLight.blueLight(); // 무광꼬치
    blueLightRedLight.redLight(); // 피어씀다.
  }
}