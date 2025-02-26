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
  //  Forgetting to deregister lapsed listener problem, then memory leak would occur
  //  To solve this problem, we can use WeakReference
  @Override
  public void registerObserver(Observer observer) {
    this.propertyChangeSupport.addPropertyChangeListener(observer);
  }

  @Override
  public void unregisterObserver(Observer observer) {
    this.propertyChangeSupport.removePropertyChangeListener(observer);
  }
}
