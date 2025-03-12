package pattern.structure.decorator.v1.decorator;

import pattern.structure.decorator.v1.Beverage;
import pattern.structure.decorator.v1.CondimentDecorator;

public class Whip extends CondimentDecorator {

  public Whip(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }

  @Override
  public double cost() {
    return this.beverage.cost() + 0.10;
  }
}
