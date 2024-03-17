package pattern.behavior.template.callback.v2;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SingletonIntOperationTest {

  private final FileProcessor<Integer> fileProcessor = new IntegerFileProcessor();
  @Test
  void plusCallbackTest() throws IOException {
    String filePath = new ClassPathResource("numbers.txt").getFile().getPath();

    int result = fileProcessor.process(filePath, SingletonIntOperation.PLUS);

    assertThat(result).isEqualTo(15);
  }

  @Test
  void multiplyCallbackTest() throws IOException {
    String filePath = new ClassPathResource("numbers.txt").getFile().getPath();

    int result = fileProcessor.process(filePath, SingletonIntOperation.MULTIPLY);

    assertThat(result).isEqualTo(120);
  }
}
