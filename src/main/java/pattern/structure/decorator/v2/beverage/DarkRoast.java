package pattern.structure.decorator.v2.beverage;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import pattern.structure.decorator.v2.Beverage;
import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.SizePricingPolicy;
import pattern.structure.decorator.v2.policy.FixedDarkRoastPricingPolicy;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class DarkRoast implements Beverage {
  @Getter
  private final BeverageSize size;
  private final SizePricingPolicy sizePricingPolicy;

  public static DarkRoast withDefaultPolicy(BeverageSize beverageSize) {
    return new DarkRoast(beverageSize, FixedDarkRoastPricingPolicy.getInstance());
  }

  public static DarkRoast of(BeverageSize beverageSize, SizePricingPolicy sizePricingPolicy) {
    return new DarkRoast(beverageSize, sizePricingPolicy);
  }

  @Override
  public double cost() {
    return sizePricingPolicy.calculatePrice(size);
  }

  @Override
  public String getDescription() {
    return "다크 로스트";
  }
}
