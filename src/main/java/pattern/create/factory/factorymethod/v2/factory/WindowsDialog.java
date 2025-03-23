package pattern.create.factory.factorymethod.v2.factory;

import pattern.create.factory.factorymethod.v2.product.Button;
import pattern.create.factory.factorymethod.v2.product.WindowsButton;

public class WindowsDialog extends Dialog {
  @Override
  public Button create() {
    return new WindowsButton();
  }
}
