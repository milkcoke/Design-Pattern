package m.falcon.designpattern.createpattern.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SettingsTest {

  @DisplayName("Should have singleton instance")
  @Test
  void getInstance() {
    // given
    Settings firstSetting = Settings.getInstance();
    // when
    Settings secondSetting = Settings.getInstance();
    // then
    assertThat(firstSetting).isSameAs(secondSetting);
  }
}
