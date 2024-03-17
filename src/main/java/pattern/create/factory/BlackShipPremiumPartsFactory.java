package pattern.create.factory;

import pattern.create.domain.ship.Anchor;
import pattern.create.domain.ship.BlackPremiumAnchor;
import pattern.create.domain.ship.BlackPremiumWheel;
import pattern.create.domain.ship.Wheel;

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
