package m.falcon.designpattern.createpattern.domain.game;

public interface GameService {
    void loadGame() throws InterruptedException;
    void startGame();
}
