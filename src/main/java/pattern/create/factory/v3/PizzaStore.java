package pattern.create.factory.v3;

import pattern.create.factory.v3.domain.Pizza;

public interface PizzaStore {
  Pizza orderPizza(String type);
}
