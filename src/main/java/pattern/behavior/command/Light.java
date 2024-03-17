package pattern.behavior.command;

import lombok.Getter;

@Getter
public class Light {

    private boolean isOn = false;

    public void on() {
        if (this.isOn) {
            System.out.println("이미 불이 켜져있습니다.");
        } else {
            this.isOn = true;
            System.out.println("불이 켜졌습니다.");
        }
    }
    public void off() {
        if (!this.isOn) {
            System.out.println("이미 불이 꺼져있습니다.");
        } else {
            this.isOn = false;
            System.out.println("불이 꺼졌습니다.");
        }
    }
}
