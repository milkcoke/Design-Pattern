package pattern.structure.decorator.v2.beverage;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import pattern.structure.decorator.v2.Beverage;
import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.SizePricingPolicy;
import pattern.structure.decorator.v2.policy.FixedDecafPricingPolicy;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Decaf implements Beverage {
  @Getter
  private final BeverageSize size;
  private final SizePricingPolicy policy;

  public static Decaf withDefaultPolicy(BeverageSize size) {
    return new Decaf(size, FixedDecafPricingPolicy.getInstance());
  }
  public static Decaf of(BeverageSize size, SizePricingPolicy policy) {
    return new Decaf(size, policy);
  }

  @Override
  public double cost() {
    return this.policy.calculatePrice(size);
  }

  @Override
  public String getDescription() {
    return "디카페인";
  }
}
