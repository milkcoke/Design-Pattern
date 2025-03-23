package pattern.behavior.observer.v4;

import lombok.RequiredArgsConstructor;
import pattern.behavior.observer.v4.event.TextEditorEvent;
import pattern.behavior.observer.v4.subject.EventManager;

import java.nio.file.Path;

import static pattern.behavior.observer.v4.event.EditorEventType.*;

@RequiredArgsConstructor
public class TextEditor implements Editor {
  private final EventManager eventManager;
  private String currentText = "";

  public void editText(String text) {
    this.currentText = text;
    eventManager.notifyToAll(new TextEditorEvent(TEXT_CHANGED, this.currentText, null));
  }
  @Override
  public void openFile(Path path) {
    eventManager.notifyToAll(new TextEditorEvent(FILE_OPENED, null, path));
  }

  @Override
  public void saveFile(Path path) {
    eventManager.notifyToAll(new TextEditorEvent(FILE_SAVED, null, path));
  }
}
