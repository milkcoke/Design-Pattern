package m.falcon.designpattern.behaviorpattern.commandpattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GameFinishCommand implements Command {
    private final Game game;
    @Override
    public void execute() {
        this.game.finish();
    }
}
