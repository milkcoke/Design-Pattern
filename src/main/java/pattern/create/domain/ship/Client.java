package pattern.create.domain.ship;

import lombok.Getter;
import pattern.create.factory.v1.ShipFactory;

@Getter
public class Client {
    private String name;
    private String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Ship orderShip(ShipFactory shipFactory, String shipName) {
        return shipFactory.orderShip(this, shipName);
    }
}
