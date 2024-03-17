package pattern.create.domain.game;

public interface GameService {
    void loadGame() throws InterruptedException;
    void startGame();
}
