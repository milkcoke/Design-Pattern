package pattern.behavior.observer.v3;

import java.beans.PropertyChangeListener;

public interface Observer<T> extends PropertyChangeListener {
  void onUpdate(T subject);
}
