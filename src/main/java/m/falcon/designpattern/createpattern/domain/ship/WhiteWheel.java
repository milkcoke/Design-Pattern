package m.falcon.designpattern.createpattern.domain.ship;

public class WhiteWheel implements Wheel {
  @Override
  public void move() {
    System.out.println("Moved by " + this.getClass().getSimpleName());
  }
}
