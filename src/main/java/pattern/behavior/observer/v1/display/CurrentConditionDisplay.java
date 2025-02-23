package pattern.behavior.observer.v1.display;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pattern.behavior.observer.v1.Display;
import pattern.behavior.observer.v1.Observer;
import pattern.behavior.observer.v1.weatherdata.WeatherData;

class CurrentConditionDisplay implements Display, Observer<WeatherData> {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private final WeatherData weatherData;
  private float temperature;
  private float humidity;

  public CurrentConditionDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
  @Override
  public void display() {
    logger.info("[Current condition state] temperature: {} humidity: {}", this.temperature, this.humidity);
  }
  @Override
  public void onUpdate(WeatherData weatherData) {
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    this.display();
  }

}
