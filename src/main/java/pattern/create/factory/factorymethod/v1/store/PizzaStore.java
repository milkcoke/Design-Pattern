package pattern.create.factory.factorymethod.v1.store;

import pattern.create.factory.factorymethod.v1.domain.Pizza;

public interface PizzaStore {
  Pizza orderPizza(String type);
}
