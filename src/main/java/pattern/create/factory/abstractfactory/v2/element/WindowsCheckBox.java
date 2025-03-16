package pattern.create.factory.abstractfactory.v2.element;

public class WindowsCheckBox implements CheckBox {
  @Override
  public void click() {
    System.out.println("Windows checkbox clicked");
  }
}
