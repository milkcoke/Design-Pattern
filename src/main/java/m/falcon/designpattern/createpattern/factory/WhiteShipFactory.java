package m.falcon.designpattern.createpattern.factory;

import lombok.RequiredArgsConstructor;
import m.falcon.designpattern.createpattern.domain.ship.Ship;
import m.falcon.designpattern.createpattern.domain.ship.WhiteShip;

@RequiredArgsConstructor
public class WhiteShipFactory implements ShipFactory {
    private final ShipPartsFactory shipPartsFactory;

    // orderShip 은 default 메소드라 따로 구현 필요 X
    @Override
    public Ship create() {
        return new WhiteShip(
            WhiteShip.class.getSimpleName(),
            "White",
            "WhiteLogo",
            shipPartsFactory.createWheel(),
            shipPartsFactory.createAnchor()
        );
    }
}
