package pattern.create.factory.v3.factory;

import pattern.create.factory.v3.domain.Pizza;

public interface PizzaFactory {
  Pizza create(String type);
}
