package behavioral.command.pattern.commands;

import behavioral.command.pattern.Command;
import behavioral.command.pattern.Light;

/**
 * ----------
 * Step 3
 * ----------
 * Concrete Command to turn on the light.
 */
public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }
}
