package pattern.create.factory.simplefactory;

import pattern.create.factory.simplefactory.domain.Pizza;
import pattern.create.factory.simplefactory.factory.SimplePizzaFactory;

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
