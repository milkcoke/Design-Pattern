package pattern.structure.decorator.v2.policy;

import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.SizePricingPolicy;

public class SoyPricingPolicy implements SizePricingPolicy {
  private SoyPricingPolicy(){}
  private static class Holder {
    private static final SoyPricingPolicy INSTANCE = new SoyPricingPolicy();
  }
  public static SizePricingPolicy getInstance() {
    return Holder.INSTANCE;
  }

  @Override
  public double calculatePrice(BeverageSize beverageSize) {
    return switch (beverageSize) {
      case TALL -> 0.15;
      case GRANDE -> 0.20;
      case VENTI -> 0.25;
    };
  }
}
