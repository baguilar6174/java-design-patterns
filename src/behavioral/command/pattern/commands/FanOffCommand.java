package behavioral.command.pattern.commands;

import behavioral.command.pattern.Command;
import behavioral.command.pattern.Fan;

/**
 * ----------
 * Step 7
 * ----------
 * Concrete Command to turn off the fan.
 */
public class FanOffCommand implements Command {
    private final Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.off();
    }
}
