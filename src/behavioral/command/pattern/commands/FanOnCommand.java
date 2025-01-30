package behavioral.command.pattern.commands;

import behavioral.command.pattern.Command;
import behavioral.command.pattern.Fan;

/**
 * ----------
 * Step 6
 * ----------
 * Concrete Command to turn on the fan.
 */
public class FanOnCommand implements Command {
    private final Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.on();
    }
}
