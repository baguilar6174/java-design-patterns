package behavioral.command.task.commands;

import behavioral.command.task.Command;
import behavioral.command.task.TextEditor;

public class CopyCommand implements Command {

    private final TextEditor editor;

    public CopyCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        this.editor.copy();
    }
}
