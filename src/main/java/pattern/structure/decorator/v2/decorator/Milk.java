package pattern.structure.decorator.v2.decorator;

import pattern.structure.decorator.v2.Beverage;
import pattern.structure.decorator.v2.CondimentDecorator;
import pattern.structure.decorator.v2.SizePricingPolicy;

public class Milk extends CondimentDecorator {
  private final SizePricingPolicy policy;

  private Milk(Beverage beverage, SizePricingPolicy policy) {
    super(beverage);
    this.policy = policy;
  }

  public static Milk create(Beverage beverage, SizePricingPolicy policy) {
    return new Milk(beverage, policy);
  }

  @Override
  public double cost() {
    return beverage.cost() + this.policy.calculatePrice(beverage.getSize());
  }
}
