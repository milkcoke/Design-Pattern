package pattern.behavior.observer.v2.display;

import lombok.extern.slf4j.Slf4j;
import pattern.behavior.observer.v2.Display;
import pattern.behavior.observer.v2.Observer;
import pattern.behavior.observer.v2.weatherdata.WeatherData;

import java.beans.PropertyChangeEvent;

@Slf4j
class StatisticsDisplay implements Display, Observer<WeatherData> {
  // It's not required to removeObserver from WeatherData since display always exist with the weatherData.
  private final WeatherData weatherData;
  private double totalTemperature;
  private double maxTemperature;
  private double minTemperature;
  private double avgTemperature;
  private int count = 0;

  public StatisticsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    if (!evt.getPropertyName().equals("temperature")) {
      return;
    }
    onUpdate(this.weatherData);
  }

  @Override
  public void display() {
    log.info("Max temperature: {}, Avg temperature: {}, Min temperature: {}", this.maxTemperature, this.avgTemperature, this.minTemperature);
  }

  @Override
  public void onUpdate(WeatherData weatherData) {
    this.totalTemperature += weatherData.getTemperature();
    this.maxTemperature = Math.max(maxTemperature, weatherData.getTemperature());
    this.minTemperature = Math.min(minTemperature, weatherData.getTemperature());
    this.count++;
    this.avgTemperature = totalTemperature / count;
    this.display();
  }
}
