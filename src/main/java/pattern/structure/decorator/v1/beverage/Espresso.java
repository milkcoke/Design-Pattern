package pattern.structure.decorator.v1.beverage;

import pattern.structure.decorator.v1.Beverage;

public class Espresso implements Beverage {
  @Override
  public double cost() {
    return 1.99;
  }

  @Override
  public String getDescription() {
    return "에스프레소";
  }
}
