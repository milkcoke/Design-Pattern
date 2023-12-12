package m.falcon.designpattern.createpattern.factory;

import m.falcon.designpattern.createpattern.domain.ship.Anchor;
import m.falcon.designpattern.createpattern.domain.ship.Wheel;

public class WhiteShipPremiumPartsFactory implements ShipPartsFactory {
  @Override
  public Anchor createAnchor() {
    return new WhitePremiumAnchor();
  }

  @Override
  public Wheel createWheel() {
    return new WhitePremiumWheel();
  }
}
