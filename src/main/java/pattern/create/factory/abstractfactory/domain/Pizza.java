package pattern.create.factory.abstractfactory.domain;

public interface Pizza {
  default String name(){
    return this.getClass().getSimpleName();
  };

  void prepare();

  void bake();

  void cut();

  void box();
}
