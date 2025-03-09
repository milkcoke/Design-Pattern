package pattern.structure.decorator.v2;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class CondimentDecorator implements Beverage {
   protected final Beverage beverage;

   @Override
   public BeverageSize getSize() {
      return beverage.getSize();
   }
}
