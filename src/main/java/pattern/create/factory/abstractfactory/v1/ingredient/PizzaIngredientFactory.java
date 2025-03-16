package pattern.create.factory.abstractfactory.v1.ingredient;

import pattern.create.factory.abstractfactory.domain.ingredient.*;
import pattern.create.factory.abstractfactory.v1.domain.ingredient.*;

public interface PizzaIngredientFactory {
  Dough createDough();
  Sauce createSauce();
  Cheese createCheese();
  Veggies[] createVeggies();
  Pepperoni createPepperoni();
  Clams createClams();
}
