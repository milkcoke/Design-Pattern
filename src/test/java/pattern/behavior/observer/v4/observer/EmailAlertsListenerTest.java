package pattern.behavior.observer.v4.observer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pattern.behavior.observer.v4.Editor;
import pattern.behavior.observer.v4.TextEditor;
import pattern.behavior.observer.v4.subject.EditorEventManager;
import pattern.behavior.observer.v4.subject.EventManager;

import java.nio.file.Path;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class EmailAlertsListenerTest {
  @DisplayName("Send email when file saved")
  @Test
  void sendMailWhenFileSaved() {
    // given
    EmailAlertsListener listener = Mockito.spy(new EmailAlertsListener());
    EventManager eventManager = new EditorEventManager();
    Editor textEditor = new TextEditor(eventManager);
    eventManager.registerObserver(listener);

    // when
    Path testPath = Path.of(System.getProperty("user.dir") + "/src/test/resources/email-alerts.txt");
    textEditor.saveFile(testPath);
    // then
    verify(listener, times(1)).sendEmail(
      eq("falcon@gmail.com"),
      eq(testPath)
    );
  }

  @DisplayName("Should not send email other event occurring")
  @Test
  void shouldNOtSendMailOtherEventOccurring() {
    // given
    EmailAlertsListener listener = Mockito.spy(new EmailAlertsListener());
    EventManager eventManager = new EditorEventManager();
    TextEditor textEditor = new TextEditor(eventManager);
    eventManager.registerObserver(listener);
    Path testPath = Path.of(System.getProperty("user.dir") + "/src/test/resources/email-alerts.txt");
    // when
    textEditor.openFile(testPath);
    textEditor.editText("this is a test");
    // then
    verify(listener, times(0)).sendEmail(any(), any());
  }

}
