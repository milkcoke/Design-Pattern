package pattern.behavior.observer.v3.weatherdata;

import lombok.Getter;
import pattern.behavior.observer.v3.Observer;
import pattern.behavior.observer.v3.Subject;
import pattern.behavior.observer.v3.WeakPropertyChangeSupport;
import pattern.behavior.observer.v3.propertychangesupport.WeakPropertyChangeSupportImpl;

@Getter
public class WeatherData implements Subject {
  // Thread-Safe
  private final WeakPropertyChangeSupport propertyChangeSupport = new WeakPropertyChangeSupportImpl(this);
  private double temperature;
  private double humidity;
  private double pressure;

  public void updateTemperature(double newTemperature) {
    double oldTemperature = this.temperature;
    this.temperature = newTemperature;
    this.propertyChangeSupport.firePropertyChange("temperature", oldTemperature, newTemperature);
  }

  public void updateHumidity(double newHumidity) {
    double oldHumidity = this.humidity;
    this.humidity = newHumidity;
    this.propertyChangeSupport.firePropertyChange("humidity", oldHumidity, newHumidity);
  }

  public void updatePressure(double newPressure) {
    double oldPressure = this.humidity;
    this.humidity = newPressure;
    this.propertyChangeSupport.firePropertyChange("pressure", oldPressure, newPressure);
  }

  @Override
  public void registerObserver(Observer observer) {
    this.propertyChangeSupport.addPropertyChangeListener(observer);
  }

  @Override
  public void unregisterObserver(Observer observer) {
    this.propertyChangeSupport.removePropertyChangeListener(observer);
  }
}
