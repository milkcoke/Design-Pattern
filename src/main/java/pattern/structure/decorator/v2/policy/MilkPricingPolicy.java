package pattern.structure.decorator.v2.policy;

import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.SizePricingPolicy;

public class MilkPricingPolicy implements SizePricingPolicy {
  private MilkPricingPolicy() {}
  private static class Holder {
    private static final MilkPricingPolicy INSTANCE = new MilkPricingPolicy();
  }
  public static MilkPricingPolicy getInstance() {
    return Holder.INSTANCE;
  }

  @Override
  public double calculatePrice(BeverageSize beverageSize) {
    return switch (beverageSize) {
      case TALL -> 0.10;
      case GRANDE -> 0.15;
      case VENTI -> 0.20;
    };
  }
}
