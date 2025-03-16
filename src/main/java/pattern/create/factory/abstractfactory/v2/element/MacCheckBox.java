package pattern.create.factory.abstractfactory.v2.element;

public class MacCheckBox implements CheckBox {
  @Override
  public void click() {
    System.out.println("Mac checkbox clicked");
  }
}
