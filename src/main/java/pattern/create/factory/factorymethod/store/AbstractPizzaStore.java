package pattern.create.factory.factorymethod.store;

import pattern.create.factory.factorymethod.domain.Pizza;

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
