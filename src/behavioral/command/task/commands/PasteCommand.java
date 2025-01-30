package behavioral.command.task.commands;

import behavioral.command.task.Command;
import behavioral.command.task.TextEditor;

public class PasteCommand implements Command {

    private final TextEditor editor;

    public PasteCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        this.editor.paste();
    }
}
