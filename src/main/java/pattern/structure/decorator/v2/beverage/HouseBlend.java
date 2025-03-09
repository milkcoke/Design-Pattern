package pattern.structure.decorator.v2.beverage;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import pattern.structure.decorator.v2.Beverage;
import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.SizePricingPolicy;
import pattern.structure.decorator.v2.policy.FixedHouseBlendPricingPolicy;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class HouseBlend implements Beverage {
  @Getter
  private final BeverageSize size;
  private final SizePricingPolicy policy;

  public static HouseBlend withDefaultPolicy(BeverageSize size) {
    return new HouseBlend(size, FixedHouseBlendPricingPolicy.getInstance());
  }
  public static HouseBlend of(BeverageSize size, SizePricingPolicy policy) {
    return new HouseBlend(size, policy);
  }

  @Override
  public double cost() {
    return this.policy.calculatePrice(this.size);
  }

  @Override
  public String getDescription() {
    return "하우스 블랜드";
  }
}
