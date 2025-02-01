package behavioral.memento.pattern;

/**
 * ----------
 * Step 1
 * ----------
 * Represents the game whose state needs to be saved and restored.
 */
public class Game {
    private int level;       // Current level of the game
    private int health;      // Current health of the player
    private String position; // Current position of the player

    /**
     * Initializes the game with default values.
     */
    public Game() {
        this.level = 1;
        this.health = 100;
        this.position = "initial";
        System.out.printf("Play in level: %d, health: %d, position: %s%n", level, health, position);
    }

    /**
     * Saves the current state of the game into a memento.
     *
     * @return A GameMemento object containing the current state
     */
    public GameMemento save() {
        return new GameMemento(this.level, this.health, this.position);
    }

    /**
     * Updates the game state by playing to a new level, health, and position.
     *
     * @param level    The new level
     * @param health   The new health
     * @param position The new position
     */
    public void play(int level, int health, String position) {
        this.level = level;
        this.health = health;
        this.position = position;
        System.out.printf("Playing in level: %d, health: %d, position: %s%n", this.level, this.health, this.position);
    }

    /**
     * Restores the game state from a memento.
     *
     * @param memento The memento containing the state to restore
     */
    public void restore(GameMemento memento) {
        this.level = memento.getLevel();
        this.health = memento.getHealth();
        this.position = memento.getPosition();
        System.out.printf("Restore progress!.... Playing in level: %d, health: %d, position: %s%n", this.level, this.health, this.position);
    }
}
