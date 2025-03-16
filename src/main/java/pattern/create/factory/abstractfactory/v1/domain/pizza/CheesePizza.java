package pattern.create.factory.abstractfactory.v1.domain.pizza;

import pattern.create.factory.abstractfactory.v1.domain.Pizza;
import pattern.create.factory.abstractfactory.v1.ingredient.PizzaIngredientFactory;

public record CheesePizza(
  PizzaIngredientFactory ingredientFactory
) implements Pizza {

  @Override
  public void prepare() {
    // 모든 치즈 피자는 이 공정을 따른다.
    // 재료 종류 (Sub Class) 는 Factory  가 결정한다.
    this.ingredientFactory.createDough();
    this.ingredientFactory.createSauce();
    this.ingredientFactory.createCheese();
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
