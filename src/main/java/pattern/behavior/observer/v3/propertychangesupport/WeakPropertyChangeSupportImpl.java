package pattern.behavior.observer.v3.propertychangesupport;

import lombok.RequiredArgsConstructor;
import pattern.behavior.observer.v3.WeakPropertyChangeSupport;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RequiredArgsConstructor
public class WeakPropertyChangeSupportImpl implements WeakPropertyChangeSupport {
  private final Object source;
  // TODO: What's CopyOnWriteArrayList?
  private final List<WeakReference<PropertyChangeListener>> listeners = new CopyOnWriteArrayList<>();

  @Override
  public void addPropertyChangeListener(PropertyChangeListener listener) {
    listeners.add(new WeakReference<>(listener));
  }

  @Override
  public void removePropertyChangeListener(PropertyChangeListener listener) {
    listeners.removeIf(ref -> ref.get() == listener);
  }

  @Override
  public void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
    // FIXME: this can degrade performance since it iterate all
    listeners.removeIf(ref -> ref.get() == null);

    for (WeakReference<PropertyChangeListener> reference: listeners) {
      PropertyChangeListener listener = reference.get();
      if (listener != null) { // Clean up any null reference which has been garbage collected
        listener.propertyChange(new PropertyChangeEvent(listener, propertyName, oldValue, newValue));
      }
    }
  }
}
