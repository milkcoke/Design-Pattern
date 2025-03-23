package pattern.behavior.observer.v4.subject;

import lombok.RequiredArgsConstructor;
import pattern.behavior.observer.v4.event.Event;
import pattern.behavior.observer.v4.observer.EventListener;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RequiredArgsConstructor
public class EditorEventManager implements EventManager {
  private final List<WeakReference<EventListener<Event>>> eventListeners = new CopyOnWriteArrayList<>();

  @Override
  public void registerObserver(EventListener listener) {
    eventListeners.add(new WeakReference<>(listener));
  }

  @Override
  public void unregisterObserver(EventListener listener) {
    eventListeners.removeIf(weakReference -> weakReference.get() == listener);
  }

  @Override
  public void notifyToAll(Event event) {
    eventListeners.removeIf(ref -> ref.get() == null);

    for (WeakReference<EventListener<Event>> weakReference : eventListeners) {
      EventListener<Event> listener = weakReference.get();
      if (listener != null) {
        listener.update(event);
      }
    }
  }
}
