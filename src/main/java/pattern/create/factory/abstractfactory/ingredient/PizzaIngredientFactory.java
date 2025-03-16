package pattern.create.factory.abstractfactory.ingredient;

import pattern.create.factory.abstractfactory.domain.ingredient.*;

public interface PizzaIngredientFactory {
  Dough createDough();
  Sauce createSauce();
  Cheese createCheese();
  Veggies[] createVeggies();
  Pepperoni createPepperoni();
  Clams createClams();
}
