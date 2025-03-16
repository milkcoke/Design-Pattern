package pattern.create.factory.abstractfactory.v1.domain.pizza;

import pattern.create.factory.abstractfactory.v1.domain.Pizza;
import pattern.create.factory.abstractfactory.v1.ingredient.PizzaIngredientFactory;

public record VeggiePizza(
  PizzaIngredientFactory ingredientFactory
) implements Pizza {
  @Override
  public void prepare() {

  }

  @Override
  public void bake() {

  }

  @Override
  public void cut() {

  }

  @Override
  public void box() {

  }
}
