package m.falcon.designpattern.createpattern.domain.ship;

public abstract class Wheel {
  public void move() {
    System.out.println("Moved by " + this.getClass().getSimpleName());
  };
}
