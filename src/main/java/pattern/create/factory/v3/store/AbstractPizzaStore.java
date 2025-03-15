package pattern.create.factory.v3.store;

import pattern.create.factory.v3.domain.Pizza;

public abstract class AbstractPizzaStore implements PizzaStore {
  @Override
  public Pizza orderPizza(String type) {
    Pizza pizza = this.createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

  protected abstract Pizza createPizza(String type);
}
