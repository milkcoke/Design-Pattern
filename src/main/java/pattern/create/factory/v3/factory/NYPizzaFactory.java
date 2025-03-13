package pattern.create.factory.v3.factory;

import pattern.create.factory.v3.domain.ClamPizza;
import pattern.create.factory.v3.domain.PeperoniPizza;
import pattern.create.factory.v3.domain.Pizza;
import pattern.create.factory.v3.domain.VeggiePizza;

public class NYPizzaFactory implements PizzaFactory {
  @Override
  public Pizza create(String type) {
    return switch (type) {
      case "clam" -> new ClamPizza();
      case "pepperoni" -> new PeperoniPizza();
      case "veggie" -> new VeggiePizza();
      default -> throw new IllegalArgumentException("Unexpected type: " + type);
    };
  }
}
