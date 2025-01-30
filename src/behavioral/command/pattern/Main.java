package behavioral.command.pattern;

import behavioral.command.pattern.commands.FanOffCommand;
import behavioral.command.pattern.commands.FanOnCommand;
import behavioral.command.pattern.commands.LightOffCommand;
import behavioral.command.pattern.commands.LightOnCommand;

/**
 * ----------
 * Step 9
 * ----------
 * Command pattern implementation.
 */
public class Main {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();

        Light light = new Light();
        Fan fan = new Fan();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        FanOnCommand fanOnCommand = new FanOnCommand(fan);
        FanOffCommand fanOffCommand = new FanOffCommand(fan);

        control.setCommand("1", lightOnCommand);
        control.setCommand("2", lightOffCommand);
        control.setCommand("3", fanOnCommand);
        control.setCommand("4", fanOffCommand);

        // Attempting to press a button without an assigned command
        control.pressButton("5");

        /*
        * Result:
        *
        * No command has been assigned to this button!
        * */

        control.pressButton("1");

        /*
        * Result:
        *
        * The light is on
        * */
    }
}
