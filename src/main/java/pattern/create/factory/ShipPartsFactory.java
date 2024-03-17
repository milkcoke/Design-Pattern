package pattern.create.factory;

import pattern.create.domain.ship.Anchor;
import pattern.create.domain.ship.Wheel;

public interface ShipPartsFactory {
  Anchor createAnchor();
  Wheel createWheel();
}
