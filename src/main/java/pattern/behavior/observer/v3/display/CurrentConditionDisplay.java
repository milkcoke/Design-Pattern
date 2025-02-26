package pattern.behavior.observer.v3.display;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import pattern.behavior.observer.v3.Display;
import pattern.behavior.observer.v3.Observer;
import pattern.behavior.observer.v3.weatherdata.WeatherData;

import java.beans.PropertyChangeEvent;

@Slf4j
@ToString
public class CurrentConditionDisplay implements Display, Observer<WeatherData> {
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
  public void propertyChange(PropertyChangeEvent evt) {
    if (!evt.getPropertyName().equals("temperature") &&
        !evt.getPropertyName().equals("humidity")) {
      return;
    }
    if (this.currentHumidity == this.weatherData.getHumidity() &&
        this.currentTemperature == this.weatherData.getTemperature()) {
      return;
    }
    onUpdate(this.weatherData);
  }

  @Override
  public void display() {
    log.info(this.toString());
  }

  @Override
  public void onUpdate(WeatherData weatherData) {
    this.currentTemperature = this.weatherData.getTemperature();
    this.currentHumidity = this.weatherData.getHumidity();
    this.display();
  }
}
