package m.falcon.designpattern.createpattern.domain.ship;

import lombok.Getter;

@Getter
public abstract class Ship {
    private String name;
    private String color;
    private String logo;

    protected Ship(String name) {
        this.name = name;
    }

    protected Ship(String name, String color, String logo) {
        this.name = name;
        this.color = color;
        this.logo = logo;
    }

    void changeShipInfo(String name, String color, String logo) {
        this.name = name;
        this.color = color;
        this.logo = logo;
    }
}
