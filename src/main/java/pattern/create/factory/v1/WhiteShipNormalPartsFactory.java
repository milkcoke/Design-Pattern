package pattern.create.factory.v1;

import pattern.create.domain.ship.Anchor;
import pattern.create.domain.ship.Wheel;
import pattern.create.domain.ship.WhiteAnchor;
import pattern.create.domain.ship.WhiteWheel;

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
