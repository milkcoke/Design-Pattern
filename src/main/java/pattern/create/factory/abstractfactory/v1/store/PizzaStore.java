package pattern.create.factory.abstractfactory.v1.store;

import pattern.create.factory.abstractfactory.v1.domain.Pizza;

public interface PizzaStore {
  Pizza orderPizza(String type);
}
