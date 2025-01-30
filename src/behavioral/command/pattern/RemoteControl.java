package behavioral.command.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * ----------
 * Step 8
 * ----------
 * Invoker class that stores and executes commands.
 */
public class RemoteControl {
    private final Map<String, Command> commands = new HashMap<>();

    /**
     * Assigns a command to a specific button.
     *
     * @param button the button identifier
     * @param command the command to be executed
     */
    void setCommand(String button, Command command) {
        this.commands.put(button, command);
    }

    /**
     * Executes the command assigned to the given button.
     *
     * @param button the button identifier
     */
    void pressButton(String button) {
        if (this.commands.containsKey(button)) {
            this.commands.get(button).execute();
            return;
        }
        System.out.println("No command has been assigned to this button!");
    }
}
