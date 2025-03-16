package pattern.create.factory.abstractfactory.store;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import pattern.create.factory.abstractfactory.domain.Pizza;
import pattern.create.factory.abstractfactory.ingredient.PizzaIngredientFactory;

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
