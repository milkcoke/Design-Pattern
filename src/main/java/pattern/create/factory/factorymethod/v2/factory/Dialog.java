package pattern.create.factory.factorymethod.v2.factory;

import pattern.create.factory.factorymethod.v2.product.Button;

public abstract class Dialog {
  public void render() {
    Button button = this.create();
    button.render();
  }

  public abstract Button create();
}
