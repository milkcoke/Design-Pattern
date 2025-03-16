package pattern.create.factory.abstractfactory.v2.element;

public class WindowsButton implements Button {
  @Override
  public void click() {
    System.out.println("Windows button clicked");
  }
}
