package behavioral.memento.task;

/**
 * Client code to demonstrate the Memento Pattern.
 */
public class Main {
    public static void main(String[] args) {
        DrawingBoard drawingBoard = new DrawingBoard(); // Create a new drawing board
        History history = new History(); // Create a history to store mementos

        // Add shapes and save the state after each step
        drawingBoard.addShape("Circle");
        history.push(drawingBoard.save());

        drawingBoard.addShape("Square");
        history.push(drawingBoard.save());

        drawingBoard.addShape("Triangle");
        drawingBoard.showBoard(); // Display the current state of the board

        // Undo the last change
        DrawingMemento memento = history.pop();
        if (memento != null) {
            drawingBoard.restore(memento);
        }
        drawingBoard.showBoard(); // Display the state after undo

        // Undo another change
        memento = history.pop();
        if (memento != null) {
            drawingBoard.restore(memento);
        }
        drawingBoard.showBoard(); // Display the state after another undo
    }
}
