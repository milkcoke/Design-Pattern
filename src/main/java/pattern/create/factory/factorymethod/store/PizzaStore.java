package pattern.create.factory.factorymethod.store;

import pattern.create.factory.factorymethod.domain.Pizza;

public interface PizzaStore {
  Pizza orderPizza(String type);
}
