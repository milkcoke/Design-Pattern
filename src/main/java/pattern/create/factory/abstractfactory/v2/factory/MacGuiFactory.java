package pattern.create.factory.abstractfactory.v2.factory;

import pattern.create.factory.abstractfactory.v2.element.MacButton;
import pattern.create.factory.abstractfactory.v2.element.MacCheckBox;
import pattern.create.factory.abstractfactory.v2.element.Button;
import pattern.create.factory.abstractfactory.v2.element.CheckBox;

public class MacGuiFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new MacCheckBox();
  }
}
