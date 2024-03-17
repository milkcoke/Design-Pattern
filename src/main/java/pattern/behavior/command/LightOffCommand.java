package pattern.behavior.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LightOffCommand implements Command {
    private final Light light;
    @Override
    public void execute() {
        this.light.off();
    }
}
