package m.falcon.designpattern.domain.game;

public interface GameService {
    void loadGame() throws InterruptedException;
    void startGame();
}
