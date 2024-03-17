package pattern.create.domain.game;

public class DefaultGameService implements GameService {
    public void loadGame() throws InterruptedException {
        System.out.println("게임 로딩중입니다.");
        Thread.sleep(1000L);
        System.out.println("로딩 완료");
    }
    public void startGame() {
        System.out.println("게임 시작!");
    }
}
