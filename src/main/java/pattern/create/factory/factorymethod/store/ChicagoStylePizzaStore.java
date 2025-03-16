package pattern.create.factory.factorymethod.store;

import pattern.create.factory.factorymethod.domain.*;

public class ChicagoStylePizzaStore extends AbstractPizzaStore {
  @Override
  public Pizza createPizza(String type) {
    return switch (type) {
      case "cheese" -> new ChicagoStyleCheesPizza();
      case "peperoni" -> new ChicagoStylePepperoniPizza();
      case "clam" -> new ChicagoStyleClamPizza();
      case "veggie" -> new ChicagoStyleVeggiePizza();
      default -> throw new IllegalArgumentException("Unexpected type: " + type);
    };
  }
}
