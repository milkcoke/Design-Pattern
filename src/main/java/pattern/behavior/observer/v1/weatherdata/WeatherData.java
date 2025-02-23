package pattern.behavior.observer.v1.weatherdata;

import lombok.Getter;
import pattern.behavior.observer.v1.Subject;
import pattern.behavior.observer.v1.Observer;

import java.util.LinkedList;
import java.util.List;

@Getter
public class WeatherData implements Subject {
  private float temperature;
  private float humidity;
  private float pressure;

  private final List<Observer> observers = new LinkedList<>();

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    this.measurementChanged();
  }

  public void measurementChanged() {
    this.notifyObservers();
  }

  @Override
  public void registerObserver(Observer observer) {
    this.observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    this.observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.onUpdate(this);
    }
  }
}
