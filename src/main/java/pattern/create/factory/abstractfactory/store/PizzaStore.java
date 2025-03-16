package pattern.create.factory.abstractfactory.store;

import pattern.create.factory.abstractfactory.domain.Pizza;

public interface PizzaStore {
  Pizza orderPizza(String type);
}
