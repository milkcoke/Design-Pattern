package pattern.behavior.observer.display;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pattern.behavior.observer.Display;
import pattern.behavior.observer.Observer;
import pattern.behavior.observer.weatherdata.WeatherData;

public class ForecastDisplay implements Display, Observer<WeatherData> {
  private final Logger log = LoggerFactory.getLogger(ForecastDisplay.class);
  /**
   * Should refer to the interface instead of concrete class
   */
  private final WeatherData weatherData;
  private float lastPressure;
  private float currentPressure;

  public ForecastDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
    this.currentPressure = weatherData.getPressure();
    this.lastPressure = weatherData.getPressure();
  }
  @Override
  public void onUpdate(WeatherData weatherData) {
    this.lastPressure = this.currentPressure;
    this.currentPressure = weatherData.getPressure();
    this.display();
  }

  @Override
  public void display() {
    if (this.lastPressure < this.currentPressure) {
      log.info("Up pressure: {}", this.currentPressure - this.lastPressure);
    } else if (this.lastPressure == this.currentPressure) {
      log.info("Pressure: {}", this.currentPressure);
    } else {
      log.info("Down Pressure: {}", this.currentPressure - this.lastPressure);
    }
  }
}
