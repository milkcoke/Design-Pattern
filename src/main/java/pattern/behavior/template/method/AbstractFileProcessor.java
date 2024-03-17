package pattern.behavior.template.method;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.OptionalInt;

public abstract class AbstractFileProcessor {
  /**
   * Process all values
   * @param filePath The target file path required to read for processing
   * @return Result of processing
   * @throws FileNotFoundException File is not found
   */
  public int process(String filePath) throws FileNotFoundException {
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

      OptionalInt result = br.lines()
        .mapToInt(Integer::parseInt)
        .reduce(this::calculate);

      if (result.isEmpty()) throw new IllegalStateException("The file has no content");
      return result.getAsInt();

    } catch (IOException e) {
      throw new FileNotFoundException(e.getMessage());
    }
  }

  /**
   *
   * @param prevValue Previous result value
   * @param nextValue Parsed next value
   * @return result value
   */
  abstract protected int calculate(int prevValue, int nextValue);
}
