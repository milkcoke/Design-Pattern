package m.falcon.designpattern.createpattern.domain.ship;

public abstract class Anchor {
  public void stop() {
    System.out.println("Stopped by " + this.getClass().getSimpleName());
  };
}
