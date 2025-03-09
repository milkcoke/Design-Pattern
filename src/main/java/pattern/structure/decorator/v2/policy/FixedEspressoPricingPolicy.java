package pattern.structure.decorator.v2.policy;

import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.SizePricingPolicy;

public class FixedEspressoPricingPolicy implements SizePricingPolicy {
  private FixedEspressoPricingPolicy() {}
  private static class Holder {
    private static final FixedEspressoPricingPolicy INSTANCE = new FixedEspressoPricingPolicy();
  }
  public static SizePricingPolicy getInstance() {
    return Holder.INSTANCE;
  }


    @Override
  public double calculatePrice(BeverageSize beverageSize) {
    return switch (beverageSize) {
      case TALL -> 0.5;
      default -> throw new IllegalArgumentException("Espresso only support Tall size but you provided: " + beverageSize);
    };
  }
}
