package pattern.create.factory.v2;

import pattern.create.factory.v2.domain.Pizza;

public interface PizzaStore {
  Pizza orderPizza(String type);
}
