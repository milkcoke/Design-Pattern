package pattern.behavior.template.callback.v1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.OptionalInt;

class FileProcessor {
  /**
   * Process all values
   * @param filePath The target file path required to read for processing
   * @return Result of processing
   * @throws FileNotFoundException File is not found
   */
  final public int process(String filePath, IntOperation operation) throws FileNotFoundException {
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
