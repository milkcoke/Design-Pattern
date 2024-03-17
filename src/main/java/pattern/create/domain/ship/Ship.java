package pattern.create.domain.ship;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Ship {
    private final String name;
    private final String color;
    private final String logo;

    private final Wheel wheel;
    private final Anchor anchor;


    public void moveShip() {
        this.wheel.move();
    }

    public void stopShip() {
        this.anchor.stop();
    }
}
