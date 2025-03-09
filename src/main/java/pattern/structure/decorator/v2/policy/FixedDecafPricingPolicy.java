package pattern.structure.decorator.v2.policy;

import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.SizePricingPolicy;

public class FixedDecafPricingPolicy implements SizePricingPolicy {
  private FixedDecafPricingPolicy() {}
  private static class Holder {
    private static FixedDecafPricingPolicy INSTANCE = new FixedDecafPricingPolicy();
  }
  public static SizePricingPolicy getInstance() {
    return Holder.INSTANCE;
  }
  @Override
  public double calculatePrice(BeverageSize beverageSize) {
    return switch (beverageSize) {
      case TALL -> 1.05;
      case GRANDE -> 1.15;
      case VENTI -> 1.25;
    };
  }
}
