package pattern.behavior.observer.v2;

import java.beans.PropertyChangeListener;

public interface Observer<T> extends PropertyChangeListener {
  void onUpdate(T subject);
}
