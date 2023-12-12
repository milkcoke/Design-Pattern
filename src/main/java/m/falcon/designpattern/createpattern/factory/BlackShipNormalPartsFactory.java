package m.falcon.designpattern.createpattern.factory;

import m.falcon.designpattern.createpattern.domain.ship.Anchor;
import m.falcon.designpattern.createpattern.domain.ship.BlackAnchor;
import m.falcon.designpattern.createpattern.domain.ship.BlackWheel;
import m.falcon.designpattern.createpattern.domain.ship.Wheel;

public class BlackShipNormalPartsFactory implements ShipPartsFactory {
  @Override
  public Anchor createAnchor() {
    return new BlackAnchor();
  }

  @Override
  public Wheel createWheel() {
    return new BlackWheel();
  }
}
