package m.falcon.designpattern.createpattern.factory;

import m.falcon.designpattern.createpattern.domain.ship.Anchor;
import m.falcon.designpattern.createpattern.domain.ship.Wheel;

public interface ShipPartsFactory {
  Anchor createAnchor();
  Wheel createWheel();
}
