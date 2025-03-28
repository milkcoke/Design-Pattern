package pattern.behavior.observer.v1.weatherdata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pattern.behavior.observer.v1.Display;
import pattern.behavior.observer.v1.display.CurrentConditionDisplay;
import pattern.behavior.observer.v1.display.ForecastDisplay;
import pattern.behavior.observer.v1.display.StatisticsDisplay;

public class WeatherDataTest {

  @DisplayName("Should display when weatherData is updated")
  @Test
  void notifyObserverTest() {
    // given
    WeatherData weatherData = new WeatherData();
    Display currentConditionDisplay = new CurrentConditionDisplay(weatherData);
    Display forcastDisplay = new ForecastDisplay(weatherData);
    Display statisticsDisplay = new StatisticsDisplay(weatherData);
    // when
    weatherData.setMeasurements(15.0f, 15f, 20f);
    weatherData.setMeasurements(30.0f, 65f, 30f);
    // then
  }
}
