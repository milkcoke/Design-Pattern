package pattern.create.factory.v1;

import lombok.RequiredArgsConstructor;
import pattern.create.domain.ship.BlackShip;
import pattern.create.domain.ship.Ship;

@RequiredArgsConstructor
public class BlackShipFactory implements ShipFactory {
    private final ShipPartsFactory shipPartsFactory;
    @Override
    public Ship create() {
        return new BlackShip(
            "BlackShip", "Black", "⚓",
            shipPartsFactory.createWheel(), shipPartsFactory.createAnchor()
        );
    }
}
