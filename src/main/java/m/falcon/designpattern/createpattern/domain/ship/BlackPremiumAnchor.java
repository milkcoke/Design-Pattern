package m.falcon.designpattern.createpattern.domain.ship;

import m.falcon.designpattern.createpattern.domain.ship.Anchor;

public class BlackPremiumAnchor implements Anchor {
  @Override
  public void stop() {
    System.out.println("Stopped by " + this.getClass().getSimpleName());
  }
}
