package pattern.create.factory.v1;

import pattern.create.domain.ship.Anchor;
import pattern.create.domain.ship.Wheel;
import pattern.create.domain.ship.WhitePremiumAnchor;
import pattern.create.domain.ship.WhitePremiumWheel;

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
