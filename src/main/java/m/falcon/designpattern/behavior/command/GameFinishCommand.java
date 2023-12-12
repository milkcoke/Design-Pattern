package m.falcon.designpattern.behavior.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GameFinishCommand implements Command {
    private final Game game;
    @Override
    public void execute() {
        this.game.finish();
    }
}
