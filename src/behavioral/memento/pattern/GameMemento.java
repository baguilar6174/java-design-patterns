package behavioral.memento.pattern;

/**
 * ----------
 * Step 2
 * ----------
 * Represents a memento that stores the state of the game.
 */
public class GameMemento {
    private int level;       // Level stored in the memento
    private int health;      // Health stored in the memento
    private String position; // Position stored in the memento

    /**
     * Constructs a memento with the specified state.
     *
     * @param level    The level to store
     * @param health   The health to store
     * @param position The position to store
     */
    public GameMemento(int level, int health, String position) {
        this.level = level;
        this.health = health;
        this.position = position;
    }

    /**
     * Gets the level stored in the memento.
     *
     * @return The stored level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the level in the memento.
     *
     * @param level The level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Gets the health stored in the memento.
     *
     * @return The stored health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the health in the memento.
     *
     * @param health The health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Gets the position stored in the memento.
     *
     * @return The stored position
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the position in the memento.
     *
     * @param position The position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }
}
