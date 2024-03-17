package pattern.create.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pattern.create.singleton.Settings;

import static org.assertj.core.api.Assertions.assertThat;

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
