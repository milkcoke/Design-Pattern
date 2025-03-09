package pattern.structure.decorator.v2.beverage;

import lombok.RequiredArgsConstructor;
import pattern.structure.decorator.v1.Beverage;
import pattern.structure.decorator.v2.BeverageSize;
import pattern.structure.decorator.v2.SizePricingPolicy;

@RequiredArgsConstructor
public class DarkRoast implements Beverage {
  private final BeverageSize beverageSize;
  private final SizePricingPolicy sizePricingPolicy;

  @Override
  public double cost() {
    return sizePricingPolicy.calculatePrice(beverageSize);
  }

  @Override
  public String getDescription() {
    return "다크 로스트";
  }
}
