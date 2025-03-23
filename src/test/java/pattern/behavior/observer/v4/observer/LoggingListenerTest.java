package pattern.behavior.observer.v4.observer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pattern.behavior.observer.v4.TextEditor;
import pattern.behavior.observer.v4.subject.EditorEventManager;
import pattern.behavior.observer.v4.subject.EventManager;

import java.nio.file.Path;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class LoggingListenerTest {
  @DisplayName("Should logging when text is changed")
  @Test
  void shouldLoggingWhenTextIsChanged() {
    // given
    LoggingListener mockedListener = Mockito.spy(new LoggingListener());
    EventManager eventManager = new EditorEventManager();
    TextEditor editor = new TextEditor(eventManager);
    eventManager.registerObserver(mockedListener);
    // when
    editor.editText("change!");
    // then
    verify(mockedListener, times(1)).logging("change!");
  }

  @DisplayName("Should logging only when text is changed")
  @Test
  void shouldLoggingOnlyWhenTextIsChanged() {
    // given
    LoggingListener mockedListener = Mockito.spy(new LoggingListener());
    EventManager eventManager = new EditorEventManager();
    TextEditor editor = new TextEditor(eventManager);
    eventManager.registerObserver(mockedListener);
    // when
    editor.editText("change!");
    editor.editText("change!");
    editor.editText("change!");
    // then
    verify(mockedListener, times(1)).logging("change!");
  }

  @DisplayName("Should not logging when other event occurs")
  @Test
  void shouldNotLoggingWhenOtherEventOccurs() {
    // given
    LoggingListener mockedListener = Mockito.spy(new LoggingListener());
    EventManager eventManager = new EditorEventManager();
    TextEditor editor = new TextEditor(eventManager);
    eventManager.registerObserver(mockedListener);
    Path testPath = Path.of("this is a test");
    // when
    editor.openFile(testPath);
    editor.saveFile(testPath);
    // then
    verify(mockedListener, times(0)).logging(anyString());
  }

}
