package pattern.create.factory.abstractfactory.v2.factory;


import pattern.create.factory.abstractfactory.v2.element.WindowsButton;
import pattern.create.factory.abstractfactory.v2.element.WindowsCheckBox;
import pattern.create.factory.abstractfactory.v2.element.Button;
import pattern.create.factory.abstractfactory.v2.element.CheckBox;

public class WindowsGuiFactory implements GUIFactory {

  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new WindowsCheckBox();
  }
}
