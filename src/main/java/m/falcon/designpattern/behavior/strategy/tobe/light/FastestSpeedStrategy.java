package m.falcon.designpattern.behavior.strategy.tobe.light;

public class FastestSpeedStrategy implements SpeedStrategy {
  @Override
  public void blueLight() {
    System.out.println("무광꼬치");
  }

  @Override
  public void redLight() {
    System.out.println("피었슴다.");
  }
}
