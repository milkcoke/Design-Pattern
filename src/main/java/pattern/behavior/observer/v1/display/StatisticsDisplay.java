package pattern.behavior.observer.v1.display;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pattern.behavior.observer.v1.Display;
import pattern.behavior.observer.v1.Observer;
import pattern.behavior.observer.v1.weatherdata.WeatherData;

class StatisticsDisplay implements Display, Observer<WeatherData> {
  private final Logger log = LoggerFactory.getLogger(StatisticsDisplay.class);
  // It's not required to removeObserver from WeatherData since display always exist with the weatherData.
  private final WeatherData weatherData;
  private float totalTemperature;
  private float maxTemperature;
  private float minTemperature;
  private float avgTemperature;
  private int count = 0;

  public StatisticsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
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

  @Override
  public void display() {
    log.info("Max temperature: {}, Avg temperature: {}, Min temperature: {}", this.maxTemperature, this.avgTemperature, this.minTemperature);
  }
}
