package m.falcon.designpattern.createpattern.domain.ship;

/**
 * + BlackShip 시 기존 코드를 전혀 변경하지 않았음.
 */

public class BlackShip extends Ship {
    public BlackShip(String name, String color, String logo, Wheel wheel, Anchor anchor) {
        super(name, color, logo, wheel, anchor);
    }
}
