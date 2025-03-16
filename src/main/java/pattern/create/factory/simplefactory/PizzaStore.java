package pattern.create.factory.simplefactory;

import pattern.create.factory.simplefactory.domain.Pizza;

public interface PizzaStore {
  Pizza orderPizza(String type);
}
