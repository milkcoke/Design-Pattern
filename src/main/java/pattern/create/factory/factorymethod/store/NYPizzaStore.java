package pattern.create.factory.factorymethod.store;

import pattern.create.factory.factorymethod.domain.*;

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
