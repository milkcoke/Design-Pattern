package pattern.behavior.observer.v4.subject;

import pattern.behavior.observer.v4.event.Event;
import pattern.behavior.observer.v4.observer.EventListener;

public interface EventManager {
  void registerObserver(EventListener listener);
  void unregisterObserver(EventListener listener);
  void notifyToAll(Event event);
}
