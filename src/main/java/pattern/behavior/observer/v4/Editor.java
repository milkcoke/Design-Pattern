package pattern.behavior.observer.v4;

import java.nio.file.Path;

public interface Editor {
  void openFile(Path path);
  void saveFile(Path path);
}
