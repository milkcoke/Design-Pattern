package pattern.structure.decorator.v1.decorator;

import pattern.structure.decorator.v1.Beverage;
import pattern.structure.decorator.v1.CondimentDecorator;

public class Soy extends CondimentDecorator {
  public Soy(Beverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }

  @Override
  public double cost() {
    return this.beverage.cost() + 0.15;
  }
}
