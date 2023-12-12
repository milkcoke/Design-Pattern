package m.falcon.designpattern.behavior.strategy.tobe;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BlueLightRedLight { // Context
  private final SpeedStrategy speedStrategy; // strategy

  // operation
  void blueLight() {
    this.speedStrategy.blueLight();
  }

  void redLight() {
    this.speedStrategy.redLight();
  }
}
