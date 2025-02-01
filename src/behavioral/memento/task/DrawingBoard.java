package behavioral.memento.task;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the drawing board, which is the originator in the Memento Pattern.
 */
class DrawingBoard {
    private List<String> shapes = new ArrayList<>(); // List of shapes on the board

    /**
     * Adds a shape to the drawing board.
     *
     * @param shape The shape to add
     */
    public void addShape(String shape) {
        this.shapes.add(shape);
        System.out.println("Shape added: " + shape);
    }

    /**
     * Displays the current state of the drawing board.
     */
    public void showBoard() {
        if (shapes.isEmpty()) {
            System.out.println("Current board: Empty");
        } else {
            System.out.println("Current board: " + String.join(", ", shapes));
        }
    }

    /**
     * Saves the current state of the drawing board into a memento.
     *
     * @return A DrawingMemento object containing the current state
     */
    public DrawingMemento save() {
        return new DrawingMemento(this.shapes);
    }

    /**
     * Restores the state of the drawing board from a memento.
     *
     * @param memento The memento containing the state to restore
     */
    public void restore(DrawingMemento memento) {
        this.shapes = memento.shapes();
        System.out.println("\nState restored.");
    }
}