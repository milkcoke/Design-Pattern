package m.falcon.designpattern.behaviorpattern.commandpattern;

import lombok.Getter;

@Getter
public class Game {
    private boolean isStarted = false;

    public void start() {
        if (isStarted) {
            System.out.println("이미 게임이 실행중입니다.");
            return;
        }
        System.out.println("게임 시작");
        this.isStarted = true;
    }

    public void finish() {
        if (!isStarted) {
            System.out.println("게임이 실행중이지 않습니다.");
        }
        System.out.println("게임 종료");
        this.isStarted = false;
    }
}
