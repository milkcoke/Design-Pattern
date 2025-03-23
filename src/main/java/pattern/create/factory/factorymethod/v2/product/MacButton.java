package pattern.create.factory.factorymethod.v2.product;

public class MacButton implements Button {
  @Override
  public void render() {
    System.out.println("Mac Test Button!");
    this.onClick();
  }

  @Override
  public void onClick() {
    System.out.println("MacButton is clicked!");
  }
}
