package behavioral.memento.pattern;

/**
 * ----------
 * Step 4
 * ----------
 * Client code to demonstrate the Memento Pattern.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game();          // Create a new game
        GameHistory history = new GameHistory(); // Create a history to store mementos

        // Save initial state
        history.push(game.save());

        // Play and save progress
        game.play(2, 90, "Rainforest");
        history.push(game.save());

        game.play(3, 70, "Castle");
        history.push(game.save());

        game.play(4, 50, "Lake");

        // Restore to the previous state
        System.out.println("Current state: ");
        game.restore(history.pop()); // Restore the most recent saved state

        /*
        * Result:
        *
        * Play in level: 1, health: 100, position: initial
        * Playing in level: 2, health: 90, position: Rainforest
        * Playing in level: 3, health: 70, position: Castle
        * Playing in level: 4, health: 50, position: Lake
        * Current state:
        * Restore progress!.... Playing in level: 3, health: 70, position: Castle
        * */
    }
}

