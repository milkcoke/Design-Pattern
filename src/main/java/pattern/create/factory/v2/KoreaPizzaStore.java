package pattern.create.factory.v2;

import pattern.create.factory.v2.domain.Pizza;
import pattern.create.factory.v2.factory.SimplePizzaFactory;

public class KoreaPizzaStore implements PizzaStore {
  @Override
  public Pizza orderPizza(String type) {
    Pizza pizza = new SimplePizzaFactory().create(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }
}
