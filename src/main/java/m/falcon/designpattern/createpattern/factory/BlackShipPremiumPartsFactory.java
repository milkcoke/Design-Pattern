package m.falcon.designpattern.createpattern.factory;

import m.falcon.designpattern.createpattern.domain.ship.Anchor;
import m.falcon.designpattern.createpattern.domain.ship.BlackPremiumAnchor;
import m.falcon.designpattern.createpattern.domain.ship.Wheel;

public class BlackShipPremiumPartsFactory implements ShipPartsFactory {
  @Override
  public Anchor createAnchor() {
    return new BlackPremiumAnchor();
  }

  @Override
  public Wheel createWheel() {
    return new BlackPremiumWheel();
  }
}
