package pattern.structure.decorator.v3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class LowerCaseInputStreamTest {

  @DisplayName("Create lower case")
  @Test
  void lowerCaseTest() throws IOException {

    // given
    int c;
    String filePath = new ClassPathResource("test.txt").getFile().getPath();
    try(LowerCaseInputStream lowerCaseInputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(filePath)))){
      // when
      while((c = lowerCaseInputStream.read()) >= 0) {
        System.out.print((char) c);
      }
    };

  }
}
