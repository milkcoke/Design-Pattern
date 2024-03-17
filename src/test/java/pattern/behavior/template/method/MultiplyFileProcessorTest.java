package pattern.behavior.template.method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MultiplyFileProcessorTest {
  private final AbstractFileProcessor fileProcessor = new MultiplyFileProcessor();

  @DisplayName("Should multiply all numbers")
  @Test
  void processTest() throws IOException {
    // given
    String filePath = new ClassPathResource("numbers.txt").getFile().getPath();

    // when
    int result = fileProcessor.process(filePath);

    // then
    assertThat(result).isEqualTo(120);
  }

  @DisplayName("Should throw error when file has no content")
  @Test
  void processEmptyFile() throws IOException {
    // given
    String filePath = new ClassPathResource("nothing.txt").getFile().getPath();

    // when // then
    assertThatThrownBy(()->fileProcessor.process(filePath))
      .isInstanceOf(IllegalStateException.class)
      .hasMessage("The file has no content");

  }
}
