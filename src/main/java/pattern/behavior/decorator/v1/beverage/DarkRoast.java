package pattern.behavior.decorator.v1.beverage;

import pattern.behavior.decorator.v1.Beverage;

public class DarkRoast implements Beverage {
  @Override
  public double cost() {
    return 0.99;
  }

  @Override
  public String getDescription() {
    return "다크 로스트";
  }
}
