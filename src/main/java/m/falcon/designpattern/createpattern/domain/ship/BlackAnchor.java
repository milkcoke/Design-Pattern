package m.falcon.designpattern.createpattern.domain.ship;

import m.falcon.designpattern.createpattern.domain.ship.Anchor;

public class BlackAnchor implements Anchor {
  @Override
  public void stop() {
    System.out.println("Stop by " + this.getClass().getSimpleName());
  }
}
