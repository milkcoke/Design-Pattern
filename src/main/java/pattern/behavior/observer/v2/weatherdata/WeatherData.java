package pattern.behavior.observer.v2.weatherdata;

import lombok.Getter;
import pattern.behavior.observer.v2.Observer;
import pattern.behavior.observer.v2.Subject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

@Getter
public class WeatherData implements Subject {
  /**
   더 이상 observers 를 다 가지고 있을 필요가 없다.
    Observer 는 PropertyChangeSupport 에 의해 관리된다.
   */
  private final List<Observer> observers = new ArrayList<>();
  // Thread-Safe
  private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
  private double temperature;
  private double humidity;
  private double pressure;

  public void updateTemperature(double newTemperature) {
    this.propertyChangeSupport.firePropertyChange("temperature", this.temperature, newTemperature);
    this.temperature = newTemperature;
  }

  public void updateHumidity(double newHumidity) {
    this.propertyChangeSupport.firePropertyChange("humidity", this.humidity, newHumidity);
    this.humidity = newHumidity;
  }

  public void updatePressure(double newPressure) {
    this.propertyChangeSupport.firePropertyChange("pressure", this.pressure, newPressure);
    this.pressure = newPressure;
  }


  // TODO: Lapsed Listener Problem
  //  Forgetting to deregistrate lapsed listener problem, then memory leak would occur
  //  To solve this problem, we can use WeakReference
  public void registerPropertyChangeLIstener(PropertyChangeListener propertyChangeListener) {
    this.propertyChangeSupport.addPropertyChangeListener(propertyChangeListener);
  }
  public void unregisterPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
    this.propertyChangeSupport.removePropertyChangeListener(propertyChangeListener);
  }

  @Override
  public void registerObserver(Observer observer) {
    this.observers.add(observer);
  }

  @Override
  public void unregisterObserver(Observer observer) {
    this.observers.remove(observer);
  }
}
