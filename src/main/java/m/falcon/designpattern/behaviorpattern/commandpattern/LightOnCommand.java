package m.falcon.designpattern.behaviorpattern.commandpattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LightOnCommand implements Command {
    private final Light light;
    @Override
    public void execute() {
        this.light.on();
    }
}
