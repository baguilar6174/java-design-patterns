package creational.immutabilitycopy.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ----------
 * Step 2
 * ----------
 * Manages the history of `CodeEditorState` objects to enable undo and redo functionality.
 */
public class CodeEditorHistory {
    private List<CodeEditorState> history = new ArrayList<>(); // List to store the history of states
    private int currentIndex = -1;  // Tracks the current position in the history

    /**
     * Saves a new state to the history. If undo/redo has occurred, it trims the future states.
     *
     * @param state The new state to be saved.
     */
    public void save(CodeEditorState state) {
        // Trim any "future" states if we are not at the end of the history
        if (this.currentIndex < this.history.size() - 1) {
            this.history = new ArrayList<>(history.subList(0, this.currentIndex + 1));
        }
        this.history.add(state);
        this.currentIndex++;
    }

    /**
     * Moves one step back in the history (undo).
     *
     * @return The previous state, or null if no previous state exists.
     */
    public CodeEditorState undo() {
        if (this.currentIndex > 0) {
            this.currentIndex--;
            return history.get(this.currentIndex);
        }
        return null;
    }

    /**
     * Moves one step forward in the history (redo).
     *
     * @return The next state, or null if no next state exists.
     */
    public CodeEditorState redo() {
        if (this.currentIndex < history.size() - 1) {
            this.currentIndex++;
            return history.get(this.currentIndex);
        }
        return null;
    }
}
