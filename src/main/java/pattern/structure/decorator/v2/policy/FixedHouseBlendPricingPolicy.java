package pattern.structure.decorator.v2.policy;

import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.SizePricingPolicy;

public class FixedHouseBlendPricingPolicy implements SizePricingPolicy {
  private FixedHouseBlendPricingPolicy(){}
  private static class Holder {
    private static final FixedHouseBlendPricingPolicy INSTANCE = new FixedHouseBlendPricingPolicy();
  }
  public static SizePricingPolicy getInstance() {
    return Holder.INSTANCE;
  }

  @Override
  public double calculatePrice(BeverageSize beverageSize) {
    return switch (beverageSize) {
      case TALL -> 0.89;
      case GRANDE -> 0.99;
      default -> throw new IllegalStateException("HouseBlend only TALL and GRANDE are supported but you provided: " + beverageSize.name());
    };
  }
}
