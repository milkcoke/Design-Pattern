package m.falcon.designpattern.createpattern.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BillPughSettingsTest {

  @DisplayName("Should have singleton instance")
  @Test
  void getInstance() {
    // given
    BillPughSettings firstSetting = BillPughSettings.getInstance();
    // when
    BillPughSettings secondSetting = BillPughSettings.getInstance();
    // then
    assertThat(firstSetting).isSameAs(secondSetting);
  }
}
