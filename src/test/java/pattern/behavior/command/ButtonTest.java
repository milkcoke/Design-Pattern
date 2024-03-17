package pattern.behavior.command;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ButtonTest {

    @DisplayName("On Off 버튼 커맨드와 함께 생성")
    @Test
    void lightButtonOnOffTest() {
        Light currentRoomLight = new Light();

        Button onButton = new Button(new LightOnCommand(currentRoomLight));
        Button offButton = new Button(new LightOffCommand(currentRoomLight));

        // 한 버튼이 여러 커맨드를 가지는 것이 적절할까를 고민해보라.
        // 토글버튼 vs 2개 버튼
        // 버튼으로 토글 커맨드를 실행하려면 버튼의 토글 (스위치 메소드) 와 토글 커맨드 클래스를 별도로 만들면 된다.
        onButton.press();
        assertThat(currentRoomLight.isOn()).isTrue();

        offButton.press();
        assertThat(currentRoomLight.isOn()).isFalse();
    }

    @DisplayName("게임 시작 - 종료 버튼 테스트")
    @Test
    void gameButtonTest() {
        Game game = new Game();
        Button gameStartButton = new Button(new GameStartCommand(game));
        Button gameFinishButton = new Button(new GameFinishCommand(game));

        gameStartButton.press();
        assertThat(game.isStarted()).isTrue();
        gameFinishButton.press();
        assertThat(game.isStarted()).isFalse();
    }
}
