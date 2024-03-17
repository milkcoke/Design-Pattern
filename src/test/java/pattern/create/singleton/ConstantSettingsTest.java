package pattern.create.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pattern.create.singleton.ConstantSettings;

import static org.assertj.core.api.Assertions.assertThat;

class ConstantSettingsTest {
  @DisplayName("Should be singleton with eager loading")
  @Test
  void enumTest() {
    // given
    ConstantSettings firstSetting = ConstantSettings.INSTANCE;
    // when
    ConstantSettings secondSetting = ConstantSettings.INSTANCE;
    // then
    assertThat(firstSetting).isSameAs(secondSetting);
  }
}
