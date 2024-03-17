package pattern.behavior.template.callback.v1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class AbstractFileProcessorTest {

  private final FileProcessor fileProcessor = new FileProcessor();
  @DisplayName("Should multiply all numbers")
  @Test
  void processMultiply() throws IOException {
    // given
    String filePath = new ClassPathResource("numbers.txt").getFile().getPath();
    // when
    int result = fileProcessor.process(filePath, SingletonIntOperation.MULTIPLY);
    // then
    assertThat(result).isEqualTo(120);
  }

  @DisplayName("Should add all numbers")
  @Test
  void processSum() throws IOException {
    // given
    String filePath = new ClassPathResource("numbers.txt").getFile().getPath();
    // when
    int result = fileProcessor.process(filePath, SingletonIntOperation.PLUS);
    // then
    assertThat(result).isEqualTo(15);
  }
}
