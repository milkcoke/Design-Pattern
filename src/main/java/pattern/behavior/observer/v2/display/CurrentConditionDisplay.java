package pattern.behavior.observer.v2.display;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import pattern.behavior.observer.v2.Display;
import pattern.behavior.observer.v2.Observer;
import pattern.behavior.observer.v2.weatherdata.WeatherData;

@Slf4j
@ToString
public class CurrentConditionDisplay implements Observer<WeatherData>, Display {
  private final WeatherData weatherData;
  private double currentTemperature;
  private double currentHumidity;

  public CurrentConditionDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    this.currentTemperature = weatherData.getTemperature();
    this.currentHumidity = weatherData.getHumidity();
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    log.info(this.toString());
  }

  @Override
  public void onUpdate(WeatherData weatherData) {
    if (weatherData.getTemperature() == this.currentTemperature &&
      weatherData.getHumidity() == this.currentHumidity) {
      return;
    }
    this.currentTemperature = this.weatherData.getTemperature();
    this.currentHumidity = this.weatherData.getHumidity();
    this.display();
  }
}
