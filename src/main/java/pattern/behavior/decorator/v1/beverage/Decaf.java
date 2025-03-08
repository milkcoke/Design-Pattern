package pattern.behavior.decorator.v1.beverage;

import pattern.behavior.decorator.v1.Beverage;

public class Decaf implements Beverage {
  @Override
  public double cost() {
    return 1.05;
  }

  @Override
  public String getDescription() {
    return "디카페인";
  }
}
