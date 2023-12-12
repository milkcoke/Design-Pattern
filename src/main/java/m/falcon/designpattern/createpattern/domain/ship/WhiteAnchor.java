package m.falcon.designpattern.createpattern.domain.ship;

public class WhiteAnchor implements Anchor {
  @Override
  public void stop() {
    System.out.println("Stop by " + this.getClass().getSimpleName());
  }
}
