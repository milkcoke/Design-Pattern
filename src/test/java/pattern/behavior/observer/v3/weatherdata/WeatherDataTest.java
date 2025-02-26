package pattern.behavior.observer.v3.weatherdata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pattern.behavior.observer.v3.Display;
import pattern.behavior.observer.v3.display.CurrentConditionDisplay;
import pattern.behavior.observer.v3.display.StatisticsDisplay;

class WeatherDataTest {

  @DisplayName("Display classes should be null after GC")
  @Test
  void weakReferenceTestAfterGC() {
    // given
    WeatherData weatherData = new WeatherData();
    this.createDisplays(weatherData);

    // when
    // Display through all displays.
    weatherData.updateTemperature(5.0);
    System.gc();
    // then
    // No display since all displays are garbage collected.
    weatherData.updateTemperature(10.0);
  }

  // This is for register observer without strong references.
  private void createDisplays(WeatherData weatherData) {
    Display currentConditionDisplay = new CurrentConditionDisplay(weatherData);
    Display statisticsDisplay = new StatisticsDisplay(weatherData);
  }
}
