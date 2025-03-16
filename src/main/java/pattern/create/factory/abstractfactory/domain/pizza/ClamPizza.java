package pattern.create.factory.abstractfactory.domain.pizza;

import pattern.create.factory.abstractfactory.domain.Pizza;
import pattern.create.factory.abstractfactory.ingredient.PizzaIngredientFactory;

public record ClamPizza(
  PizzaIngredientFactory ingredientFactory
) implements Pizza {
  @Override
  public void prepare() {
    // 모든 조개 피자는 이 공정을 따른다.
    this.ingredientFactory.createDough();
    this.ingredientFactory.createSauce();
    this.ingredientFactory.createCheese();
    this.ingredientFactory.createClams();
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
