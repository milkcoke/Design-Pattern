package pattern.create.factory.abstractfactory.domain.pizza;

import pattern.create.factory.abstractfactory.domain.Pizza;
import pattern.create.factory.abstractfactory.ingredient.PizzaIngredientFactory;

public record PepperoniPizza(
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
