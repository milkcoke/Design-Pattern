package m.falcon.designpattern.domain.ship;

public class BlackShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip("black-ship", "black", "⚓");
    }
}
