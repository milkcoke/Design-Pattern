package pattern.behavior.observer.v4.observer;

import lombok.extern.slf4j.Slf4j;
import pattern.behavior.observer.v4.event.TextEditorEvent;
import pattern.behavior.observer.v4.event.EditorEventType;

@Slf4j
public class LoggingListener implements EventListener<TextEditorEvent> {
  private String currentText = "";
  public void logging(String text) {
    log.info("Current currentText: {}", text);
  }
  /**
   * Should log when currentText is changed
   * @param event
   */
  @Override
  public void update(TextEditorEvent event) {
    if (event.type() == EditorEventType.TEXT_CHANGED &&
      !currentText.equals(event.currentText())
    ) {
      this.currentText = event.currentText();
      this.logging(this.currentText);
    }
  }
}
