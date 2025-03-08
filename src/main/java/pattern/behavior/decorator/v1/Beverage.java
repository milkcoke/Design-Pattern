package pattern.behavior.decorator.v1;


public interface Beverage {
  double cost();
  default String getDescription(){
    return this.getClass().getSimpleName();
  };
}
