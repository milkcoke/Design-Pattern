package pattern.structure.decorator.v1;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class CondimentDecorator implements Beverage {
   protected final Beverage beverage;
}
