package pattern.create.factory;

import pattern.create.domain.ship.Anchor;
import pattern.create.domain.ship.BlackAnchor;
import pattern.create.domain.ship.BlackWheel;
import pattern.create.domain.ship.Wheel;

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
