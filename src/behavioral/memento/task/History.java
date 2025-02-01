package behavioral.memento.task;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the history of drawing board states (mementos) for undo/redo functionality.
 */
class History {
    private final List<DrawingMemento> mementos = new ArrayList<>(); // List to store mementos

    /**
     * Adds a memento to the history.
     *
     * @param memento The memento to add
     */
    public void push(DrawingMemento memento) {
        this.mementos.add(memento);
    }

    /**
     * Retrieves and removes the most recently added memento from the history.
     *
     * @return The most recent memento, or null if the history is empty
     */
    public DrawingMemento pop() {
        if (mementos.isEmpty()) {
            System.out.println("There are no more states to restore.");
            return null;
        }
        return this.mementos.remove(mementos.size() - 1); // Remove the last memento
    }
}