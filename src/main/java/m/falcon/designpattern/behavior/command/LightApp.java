package m.falcon.designpattern.behavior.command;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class LightApp {
    private final Light light;

    // 버튼이 Invoker 일 때 Light 이 Receiver 면
    // 버튼을 누르면 Light 이 on/off 된다.
    public void press() {
        this.light.off();
    }
}
