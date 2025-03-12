package pattern.structure.decorator.v2;


public interface Beverage {
  double cost();
  default String getDescription(){
    return this.getClass().getSimpleName();
  };
  BeverageSize getSize();
}
