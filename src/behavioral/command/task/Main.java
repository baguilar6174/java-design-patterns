package behavioral.command.task;

import behavioral.command.task.commands.CopyCommand;
import behavioral.command.task.commands.PasteCommand;
import behavioral.command.task.commands.UndoCommand;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Toolbar toolbar = new Toolbar();

        CopyCommand copyCommand = new CopyCommand(editor);
        PasteCommand pasteCommand = new PasteCommand(editor);
        UndoCommand undoCommand = new UndoCommand(editor);

        toolbar.setCommand("copy", copyCommand);
        toolbar.setCommand("paste", pasteCommand);
        toolbar.setCommand("undo", undoCommand);

        editor.type("H");
        editor.type("o");
        editor.type("l");
        editor.type("a");
        editor.type(" ");
        editor.type("M");
        editor.type("u");
        editor.type("n");
        editor.type("d");
        editor.type("o");
        editor.type("!");

        System.out.println("Current text: " + editor.getText());

        System.out.println("\nCopy text: ");
        toolbar.clickButton("copy");

        System.out.println("\nPaste text: ");
        toolbar.clickButton("paste");

        System.out.println("\nUndo action: ");
        toolbar.clickButton("undo");

        System.out.println("\nUndo again: ");
        toolbar.clickButton("undo");

        System.out.println("\nUndo again: ");
        toolbar.clickButton("undo");

        System.out.println("\nFinal text: " + editor.getText());
    }
}
