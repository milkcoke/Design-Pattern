package pattern.behavior.strategy.tobe.light;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BlueLightRedLight { // Context
  private final SpeedStrategy speedStrategy; // strategy

  // operation
  public void blueLight() {
    this.speedStrategy.blueLight();
  }

  public void redLight() {
    this.speedStrategy.redLight();
  }
}
