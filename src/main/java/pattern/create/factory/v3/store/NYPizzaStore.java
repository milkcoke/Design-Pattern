package pattern.create.factory.v3.store;

import pattern.create.factory.v3.domain.*;

public class NYPizzaStore extends AbstractPizzaStore {
  @Override
  public Pizza createPizza(String type) {
    return switch (type) {
      case "cheese" -> new NYStyleCheesePizza();
      case "clam" -> new NYStyleClamPizza();
      case "pepperoni" -> new NYStylePepperoniPizza();
      case "veggie" -> new NYStyleVeggiePizza();
      default -> throw new IllegalArgumentException("Unexpected type: " + type);
    };
  }
}
