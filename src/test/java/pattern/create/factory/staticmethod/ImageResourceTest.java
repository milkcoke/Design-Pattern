package pattern.create.factory.staticmethod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ImageResourceTest {

  @DisplayName("Same image id should be singleton")
  @Test
  void shouldHaveSameImageResource() {
    // given
    ImageResource a1 = ImageResource.getInstance("A");
    ImageResource a2 = ImageResource.getInstance("A");
    // when then
    assertThat(a1).isSameAs(a2);
  }
}
