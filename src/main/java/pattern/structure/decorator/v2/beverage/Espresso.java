package pattern.structure.decorator.v2.beverage;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import pattern.structure.decorator.v2.Beverage;
import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.SizePricingPolicy;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Espresso implements Beverage {
  @Getter
  private final BeverageSize size;
  private final SizePricingPolicy policy;

  public static Espresso from(SizePricingPolicy policy) {
    return new Espresso(BeverageSize.TALL, policy);
  }
  @Override
  public double cost() {
    return this.policy.calculatePrice(size);
  }

  @Override
  public String getDescription() {
    return "에스프레소";
  }
}
