package pattern.create.factory.v2.factory;

import pattern.create.factory.v2.domain.ClamPizza;
import pattern.create.factory.v2.domain.PeperoniPizza;
import pattern.create.factory.v2.domain.Pizza;
import pattern.create.factory.v2.domain.VeggiePizza;

public class SimplePizzaFactory {
  public Pizza create(String type) {
    return switch (type) {
      case "clam" -> new ClamPizza();
      case "pepperoni" -> new PeperoniPizza();
      case "veggie" -> new VeggiePizza();
      default -> throw new IllegalArgumentException("Unexpected type: " + type);
    };
  }
}
