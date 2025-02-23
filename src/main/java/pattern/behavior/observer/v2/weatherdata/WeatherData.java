package pattern.behavior.observer.v2.weatherdata;

import lombok.Getter;
import pattern.behavior.observer.v2.Observer;
import pattern.behavior.observer.v2.Subject;

import java.util.ArrayList;
import java.util.List;

@Getter
public class WeatherData implements Subject {
  private final List<Observer> observers = new ArrayList<>();
  private double temperature;
  private double humidity;
  private double pressure;

  @Override
  public void registerObserver(Observer observer) {
    this.observers.add(observer);
  }

  @Override
  public void unregisterObserver(Observer observer) {
    this.observers.remove(observer);
  }

  @Override
  public void notifyToAllObservers() {

  }
}
