package pattern.structure.decorator.v2.policy;

import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.SizePricingPolicy;

public class FixedDarkRoastPricingPolicy implements SizePricingPolicy {
  private FixedDarkRoastPricingPolicy() {}
  private static class Holder {
    private static final FixedDarkRoastPricingPolicy INSTANCE = new FixedDarkRoastPricingPolicy();
  }
  public static SizePricingPolicy getInstance() {
    return Holder.INSTANCE;
  }

  @Override
  public double calculatePrice(BeverageSize beverageSize) {
    return switch (beverageSize) {
      case TALL -> 0.99;
      case GRANDE -> 1.09;
      case VENTI -> 1.19;
    };
  }
}
