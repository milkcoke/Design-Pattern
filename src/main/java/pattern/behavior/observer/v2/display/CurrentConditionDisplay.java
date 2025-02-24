package pattern.behavior.observer.v2.display;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import pattern.behavior.observer.v2.Display;
import pattern.behavior.observer.v2.Observer;
import pattern.behavior.observer.v2.weatherdata.WeatherData;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

@Slf4j
@ToString
public class CurrentConditionDisplay implements Observer<WeatherData>, Display, PropertyChangeListener {
  private final WeatherData weatherData;
  private double currentTemperature;
  private double currentHumidity;

  public CurrentConditionDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    this.currentTemperature = weatherData.getTemperature();
    this.currentHumidity = weatherData.getHumidity();
    weatherData.registerObserver(this);
    weatherData.registerPropertyChangeLIstener(this);
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
