package pattern.create.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ThreadSafeSettingsTest {

  @DisplayName("Should have singleton with Eager loading")
  @Test
  void getInstance() {
    // given
    ThreadSafeSettings firstSetting = ThreadSafeSettings.getInstance();
    // when
    ThreadSafeSettings secondSetting = ThreadSafeSettings.getInstance();
    // then
    assertThat(firstSetting).isSameAs(secondSetting);
  }
}
