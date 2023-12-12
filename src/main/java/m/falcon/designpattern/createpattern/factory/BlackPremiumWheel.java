package m.falcon.designpattern.createpattern.factory;

import m.falcon.designpattern.createpattern.domain.ship.Wheel;

public class BlackPremiumWheel implements Wheel {
  @Override
  public void move() {
    System.out.println("Moved by " + this.getClass().getSimpleName());
  }
}
