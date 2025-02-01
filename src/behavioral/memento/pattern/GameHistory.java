package behavioral.memento.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ----------
 * Step 3
 * ----------
 * Represents a history of game states (mementos) for undo/redo functionality.
 */
public class GameHistory {
    private final List<GameMemento> mementos; // List to store mementos

    /**
     * Initializes an empty history.
     */
    public GameHistory() {
        this.mementos = new ArrayList<>();
    }

    /**
     * Adds a memento to the history.
     *
     * @param memento The memento to add
     */
    public void push(GameMemento memento) {
        this.mementos.add(memento);
    }

    /**
     * Retrieves and removes the most recently added memento from the history.
     *
     * @return The most recent memento
     */
    public GameMemento pop() {
        if (mementos.isEmpty()) {
            throw new IllegalStateException("No mementos available to restore.");
        }
        return this.mementos.remove(mementos.size() - 1); // Remove the last memento
    }
}
