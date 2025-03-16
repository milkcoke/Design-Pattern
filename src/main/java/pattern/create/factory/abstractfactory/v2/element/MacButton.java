package pattern.create.factory.abstractfactory.v2.element;

public class MacButton implements Button {
  @Override
  public void click() {
    System.out.println("Mac button clicked");
  }
}
