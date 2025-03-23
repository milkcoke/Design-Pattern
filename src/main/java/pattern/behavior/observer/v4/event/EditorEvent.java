package pattern.behavior.observer.v4.event;

import java.nio.file.Path;

public record EditorEvent(
  EditorEventType type,
  String currentText,
  Path filePath
) implements Event {
}
