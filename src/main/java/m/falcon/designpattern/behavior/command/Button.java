package m.falcon.designpattern.behavior.command;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
// Invoker
public class Button {
    private final Command command;

    // toggle 버튼이라 상태전환 무조건 일어남.
    public void press() {
        command.execute();
    }
}
