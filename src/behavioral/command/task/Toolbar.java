package behavioral.command.task;

import java.util.HashMap;
import java.util.Map;

public class Toolbar {
    private final Map<String, Command> commands = new HashMap<>();

    public void setCommand(String button, Command command) {
        this.commands.put(button, command);
    }

    void clickButton(String button) {
        if (this.commands.containsKey(button)) {
            this.commands.get(button).execute();
            return;
        }
        System.out.println("No command has been assigned to this button!");
    }
}
