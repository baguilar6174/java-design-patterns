package behavioral.command.task;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private String text;
    private String clipboard;
    private final List<String> history;

    public TextEditor() {
        this.text = "";
        this.clipboard = "";
        this.history = new ArrayList<>();
    }

    public void type(String text) {
        this.history.add(this.text);
        this.text += text;
    }

    public void copy() {
        this.clipboard = this.text;
        System.out.println("Text has been copied: " + this.clipboard);
    }

    public void paste() {
        this.history.add(this.text);
        this.text += this.clipboard;
        System.out.println("After paste: " + this.text);
    }

    public void undo() {
        if (!this.history.isEmpty()) {
            this.text = this.history.removeLast();
            System.out.println("Text after undo: " + this.text);
            return;
        }
        System.out.println("Nothing to undo");
    }

    public String getText() {
        return text;
    }
}
