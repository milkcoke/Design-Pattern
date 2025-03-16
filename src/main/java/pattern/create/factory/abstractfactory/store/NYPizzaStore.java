package pattern.create.factory.abstractfactory.store;

import pattern.create.factory.abstractfactory.domain.Pizza;
import pattern.create.factory.abstractfactory.domain.pizza.CheesePizza;
import pattern.create.factory.abstractfactory.domain.pizza.ClamPizza;
import pattern.create.factory.abstractfactory.domain.pizza.PepperoniPizza;
import pattern.create.factory.abstractfactory.domain.pizza.VeggiePizza;
import pattern.create.factory.abstractfactory.ingredient.PizzaIngredientFactory;

public class NYPizzaStore extends AbstractPizzaStore{
  public NYPizzaStore(PizzaIngredientFactory ingredientFactory) {
    super(ingredientFactory);
  }
  @Override
  protected Pizza createPizza(String item) {
    return switch (item) {
      case "cheese" -> new CheesePizza(this.ingredientFactory);
      case "veggie" -> new VeggiePizza(this.ingredientFactory);
      case "clam" -> new ClamPizza(this.ingredientFactory);
      case "pepperoni" -> new PepperoniPizza(this.ingredientFactory);
      default -> throw new IllegalArgumentException("item is invalid");
    };
  }
}
