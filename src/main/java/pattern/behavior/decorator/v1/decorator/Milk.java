package pattern.behavior.decorator.v1.decorator;

import pattern.behavior.decorator.v1.Beverage;
import pattern.behavior.decorator.v1.CondimentDecorator;

public class Milk extends CondimentDecorator {
  public Milk(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Milk";
  }

  @Override
  public double cost() {
    return this.beverage.cost() + 0.10;
  }
}
