package pattern.structure.decorator.v2.policy;

import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.SizePricingPolicy;

public class MochaPricingPolicy implements SizePricingPolicy {
  private MochaPricingPolicy() {}
  private static class Holder {
    private static final MochaPricingPolicy INSTANCE = new MochaPricingPolicy();
  }
  public static MochaPricingPolicy getInstance() {
    return Holder.INSTANCE;
  }
  @Override
  public double calculatePrice(BeverageSize beverageSize) {
    return switch (beverageSize) {
      case TALL -> 0.20;
      case GRANDE -> 0.25;
      case VENTI -> 0.30;
    };
  }
}
