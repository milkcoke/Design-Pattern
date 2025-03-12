package pattern.structure.decorator.v2.decorator;

import pattern.structure.decorator.v2.Beverage;
import pattern.structure.decorator.v2.CondimentDecorator;
import pattern.structure.decorator.v2.SizePricingPolicy;

public class Mocha extends CondimentDecorator {
  private final SizePricingPolicy policy;

  private Mocha(Beverage beverage, SizePricingPolicy policy) {
    super(beverage);
    this.policy = policy;
  }

  public static Mocha create(Beverage beverage, SizePricingPolicy policy) {
    return new Mocha(beverage, policy);
  }

  @Override
  public double cost() {
    return beverage.cost() + this.policy.calculatePrice(beverage.getSize());
  }
}
