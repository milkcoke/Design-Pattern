package pattern.create.factory.abstractfactory.v1.store;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import pattern.create.factory.abstractfactory.v1.domain.Pizza;
import pattern.create.factory.abstractfactory.v1.ingredient.PizzaIngredientFactory;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class AbstractPizzaStore implements PizzaStore {
  protected final PizzaIngredientFactory ingredientFactory;

  @Override
  public Pizza orderPizza(String type) {
    Pizza pizza = this.createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  protected abstract Pizza createPizza(String item);
}
