package pattern.create.factory.abstractfactory.v2.product;

import pattern.create.factory.abstractfactory.v2.factory.GUIFactory;
import pattern.create.factory.abstractfactory.v2.element.Button;
import pattern.create.factory.abstractfactory.v2.element.CheckBox;

public class MacGUI implements GUI {
  private final Button button;
  private final CheckBox checkBox;
  public MacGUI(GUIFactory factory) {
    this.button = factory.createButton();
    this.checkBox = factory.createCheckBox();
  }

  @Override
  public void display() {
    System.out.println("Mac GUI showing ..");
  }
}
