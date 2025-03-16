package pattern.create.factory.simplefactory.factory;

import pattern.create.factory.simplefactory.domain.ClamPizza;
import pattern.create.factory.simplefactory.domain.PeperoniPizza;
import pattern.create.factory.simplefactory.domain.Pizza;
import pattern.create.factory.simplefactory.domain.VeggiePizza;

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
