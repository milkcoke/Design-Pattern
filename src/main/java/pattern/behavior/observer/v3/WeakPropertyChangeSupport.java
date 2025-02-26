package pattern.behavior.observer.v3;

import java.beans.PropertyChangeListener;

public interface WeakPropertyChangeSupport {
  void addPropertyChangeListener(PropertyChangeListener listener);
  void removePropertyChangeListener(PropertyChangeListener listener);
  void firePropertyChange(String propertyName, Object oldValue, Object newValue);
}
