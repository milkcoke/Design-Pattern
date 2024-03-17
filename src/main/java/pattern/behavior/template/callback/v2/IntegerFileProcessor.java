package pattern.behavior.template.callback.v2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.OptionalInt;

public class IntegerFileProcessor implements FileProcessor<Integer> {
  @Override
  public Integer process(String filePath, Operation<Integer> operation) throws FileNotFoundException {
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

      OptionalInt result = br.lines()
        .mapToInt(Integer::parseInt)
        .reduce(operation::operate);

      if (result.isEmpty()) throw new IllegalStateException("The file has no content");
      return result.getAsInt();

    } catch (IOException e) {
      throw new FileNotFoundException(e.getMessage());
    }
  }
}
