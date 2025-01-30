package behavioral.command.task.commands;

import behavioral.command.task.Command;
import behavioral.command.task.TextEditor;

public class UndoCommand implements Command {
    private final TextEditor editor;

    public UndoCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        this.editor.undo();
    }
}
