package pattern.structure.decorator.v2.decorator;

import pattern.structure.decorator.v2.Beverage;
import pattern.structure.decorator.v2.CondimentDecorator;
import pattern.structure.decorator.v2.SizePricingPolicy;

public class Soy extends CondimentDecorator {
  private final SizePricingPolicy policy;

  private Soy(Beverage beverage, SizePricingPolicy sizePricingPolicy) {
    super(beverage);
    this.policy = sizePricingPolicy;
  }

  public static Soy from(Beverage beverage, SizePricingPolicy policy) {
    return new Soy(beverage, policy);
  }
  @Override
  public double cost() {
    return beverage.cost() + this.policy.calculatePrice(beverage.getSize());
  }
}
