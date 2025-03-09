package pattern.structure.decorator.v2.policy;

import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.SizePricingPolicy;

public class FixedDarkRoastPricingPolicy implements SizePricingPolicy {

  @Override
  public double calculatePrice(BeverageSize beverageSize) {
    return switch (beverageSize) {
      case TALL -> 0.99;
      case GRANDE -> 1.09;
      case VENTI -> 1.19;
    };
  }
}
