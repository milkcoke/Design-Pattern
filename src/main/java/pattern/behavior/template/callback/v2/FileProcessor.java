package pattern.behavior.template.callback.v2;

import java.io.FileNotFoundException;

public interface FileProcessor<T> {
  T process(String filePath, Operation<T> operation) throws FileNotFoundException;
}
