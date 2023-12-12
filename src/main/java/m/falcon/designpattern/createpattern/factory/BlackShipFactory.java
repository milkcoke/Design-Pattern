package m.falcon.designpattern.createpattern.factory;

import lombok.RequiredArgsConstructor;
import m.falcon.designpattern.createpattern.domain.ship.BlackShip;
import m.falcon.designpattern.createpattern.domain.ship.Ship;

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
