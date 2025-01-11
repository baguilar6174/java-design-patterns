package creational.immutabilitycopy.pattern;

/**
 * ----------
 * Step 1
 * ----------
 *  Represents the state of a code editor at a specific point in time.
 *  This class is immutable to ensure that state changes only occur
 *  through explicit copying using the `copyWith` method.
 */
public class CodeEditorState {
    public final String content;
    public final Integer cursorPositionLine;
    public final Boolean unsavedChanges;

    /**
     * Constructor for creating a new immutable CodeEditorState.
     *
     * @param content The content of the editor.
     * @param cursorPositionLine The cursor position (line) in the editor.
     * @param unsavedChanges Whether there are unsaved changes.
     */
    public CodeEditorState(String content, Integer cursorPositionLine, Boolean unsavedChanges) {
        this.content = content;
        this.cursorPositionLine = cursorPositionLine;
        this.unsavedChanges = unsavedChanges;
    }

    /**
     * Displays the current state of the editor.
     */
    public void displayState() {
        System.out.printf(
                "Editor State%n Content: %s%n Cursor position line: %d%n Unsaved changes?: %b%n",
                this.content, this.cursorPositionLine, this.unsavedChanges
        );
    }

    /**
     * Creates a new CodeEditorState by copying the current state and replacing specified fields.
     *
     * @param content New content for the editor, or null to retain the current content.
     * @param cursorPositionLine New cursor position, or null to retain the current position.
     * @param unsavedChanges New unsaved changes status, or null to retain the current status.
     * @return A new CodeEditorState instance with the updated values.
     */
    public CodeEditorState copyWith(String content, Integer cursorPositionLine, Boolean unsavedChanges) {
        return new CodeEditorState(
                content != null ? content : this.content,
                cursorPositionLine != null ? cursorPositionLine : this.cursorPositionLine,
                unsavedChanges != null ? unsavedChanges : this.unsavedChanges
        );
    }
}
