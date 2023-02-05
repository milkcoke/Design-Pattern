package m.falcon.designpattern.behaviorpattern.commandpattern;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GameStartCommand implements Command {
    // Command 객체에서 굳이 game 객체에 접근해서 어떤 상태를 조작할 필요는 없다.
    // Command 는 오로지 '동작'이라는 책임만 갖는다.
    // 따라서 Getter 는 필요하지 않다.
    private final Game game;

    @Override
    public void execute() {
        this.game.start();
    }
}
