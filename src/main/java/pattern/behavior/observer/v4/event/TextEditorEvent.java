package pattern.behavior.observer.v4.event;

import java.nio.file.Path;

public record TextEditorEvent(
  EditorEventType type,
  String currentText,
  Path filePath
) implements Event {
}
