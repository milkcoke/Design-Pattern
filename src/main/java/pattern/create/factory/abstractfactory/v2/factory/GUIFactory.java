package pattern.create.factory.abstractfactory.v2.factory;


import pattern.create.factory.abstractfactory.v2.element.Button;
import pattern.create.factory.abstractfactory.v2.element.CheckBox;

public interface GUIFactory {
  Button createButton();
  CheckBox createCheckBox();
}
