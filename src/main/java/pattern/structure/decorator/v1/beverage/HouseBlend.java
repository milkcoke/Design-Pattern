package pattern.structure.decorator.v1.beverage;

import pattern.structure.decorator.v1.Beverage;

public class HouseBlend implements Beverage {
  @Override
  public double cost() {
    return 0.89;
  }

  @Override
  public String getDescription() {
    return "하우스 블랜드 커피";
  }
}
