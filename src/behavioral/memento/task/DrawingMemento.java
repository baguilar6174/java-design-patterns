package behavioral.memento.task;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a memento that stores the state of the drawing board.
 *
 * @param shapes List of shapes stored in the memento
 */
record DrawingMemento(List<String> shapes) {
    /**
     * Constructs a memento with the specified shapes.
     *
     * @param shapes The list of shapes to store
     */
    public DrawingMemento(List<String> shapes) {
        // Create a copy of the shapes list to avoid mutations
        this.shapes = new ArrayList<>(shapes);
    }

    /**
     * Gets a copy of the shapes stored in the memento.
     *
     * @return A copy of the shapes list
     */
    @Override
    public List<String> shapes() {
        return new ArrayList<>(shapes); // Return a copy to avoid external modifications
    }
}
