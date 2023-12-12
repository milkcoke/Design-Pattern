package m.falcon.designpattern.behavior.command;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class GameApp {
    private final Game game;

    // 버튼이 Invoker 일 때 Game 이 Receiver 면
    // 버튼을 누르면 게임이 on/off 된다.
    public void press() {
        this.game.finish();
    }
}
