package behavioral.command.pattern.commands;

import behavioral.command.pattern.Command;
import behavioral.command.pattern.Light;

/**
 * ----------
 * Step 4
 * ----------
 * Concrete Command to turn off the light.
 */
public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }
}

