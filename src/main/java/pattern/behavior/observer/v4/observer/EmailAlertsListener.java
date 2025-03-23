package pattern.behavior.observer.v4.observer;

import lombok.extern.slf4j.Slf4j;
import pattern.behavior.observer.v4.event.TextEditorEvent;
import pattern.behavior.observer.v4.event.EditorEventType;

import java.nio.file.Path;

@Slf4j
public class EmailAlertsListener implements EventListener<TextEditorEvent> {

  public void sendEmail(String email, Path updatedFilePath) {
    log.info("Sending email to {}", email);
    log.info("File is saved to {}", updatedFilePath.toFile().getPath());
  }

  /**
   * Should send mail only when file is saved
   * @param event
   */
  @Override
  public void update(TextEditorEvent event) {
    if (event.type() == EditorEventType.FILE_SAVED) {
      this.sendEmail("falcon@gmail.com", event.filePath());
    }
  }
}
