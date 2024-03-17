package pattern.create.factory;

import lombok.RequiredArgsConstructor;
import pattern.create.domain.ship.Ship;
import pattern.create.domain.ship.WhiteShip;

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
