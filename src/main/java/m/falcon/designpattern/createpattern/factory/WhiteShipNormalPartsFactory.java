package m.falcon.designpattern.createpattern.factory;

import m.falcon.designpattern.createpattern.domain.ship.Anchor;
import m.falcon.designpattern.createpattern.domain.ship.Wheel;
import m.falcon.designpattern.createpattern.domain.ship.WhiteAnchor;
import m.falcon.designpattern.createpattern.domain.ship.WhiteWheel;

public class WhiteShipNormalPartsFactory implements ShipPartsFactory {
  @Override
  public Anchor createAnchor() {
    return new WhiteAnchor();
  }

  @Override
  public Wheel createWheel() {
    return new WhiteWheel();
  }
}
