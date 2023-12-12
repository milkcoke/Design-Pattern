package m.falcon.designpattern.createpattern.factory;

import m.falcon.designpattern.createpattern.domain.ship.Anchor;

public class WhitePremiumAnchor implements Anchor {
  @Override
  public void stop() {
    System.out.println("Stopped by " + this.getClass().getSimpleName());
  }
}
