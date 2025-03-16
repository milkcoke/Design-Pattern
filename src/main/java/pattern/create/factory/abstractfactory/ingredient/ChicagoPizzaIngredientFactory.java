package pattern.create.factory.abstractfactory.ingredient;

import pattern.create.factory.abstractfactory.domain.ingredient.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  @Override
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  @Override
  public Veggies[] createVeggies() {
    return new Veggies[]{new Garlic(), new Mushroom(), new Onion()};
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClams() {
    return new FrozenClams();
  }
}
