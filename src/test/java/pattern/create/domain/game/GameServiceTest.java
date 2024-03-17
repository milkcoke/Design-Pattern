package pattern.create.domain.game;

import org.junit.jupiter.api.Test;

class GameServiceTest {
    // 게임 서비스 구현체 코드를 전혀 건드리지 않고
    // 클라이언트 코드의 변경도 하지않고 (main , 호출부)
    // 변경에 닫혀있고, 확장에 열려있는 OCP 를 지키며
    // 로깅, 캐싱, 레이지로딩을 하고싶다.

    // 이 때 활용하기 좋은게 프록시 패턴이다.
    @Test
    void loadGameTest() throws InterruptedException {
        // Constructor DI
        GameServiceProxy gameServiceProxy = new GameServiceProxy(new DefaultGameService());
        gameServiceProxy.loadGame();
    }
}
