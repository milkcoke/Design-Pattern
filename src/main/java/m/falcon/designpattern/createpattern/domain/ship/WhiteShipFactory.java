package m.falcon.designpattern.createpattern.domain.ship;

public class WhiteShipFactory implements ShipFactory {

    // orderShip 은 default 메소드라 따로 구현 필요 X
    @Override
    public WhiteShip createShip() {
        return new WhiteShip("white-ship", "white", "⇯");
    }
}
