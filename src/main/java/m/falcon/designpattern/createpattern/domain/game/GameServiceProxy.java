package m.falcon.designpattern.createpattern.domain.game;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class GameServiceProxy implements GameService {
    private final GameService gameService;

    @Override
    public void loadGame() throws InterruptedException {
        // lazy Loading
//        if (gameService == null) {this.gameService = new DefaultGameService();}

        long before = System.currentTimeMillis();
        this.gameService.loadGame();
        long after = System.currentTimeMillis();
        System.out.println(after - before + "ms elapsed.");
    }

    @Override
    public void startGame() {
    }
}
