package behavioral.strategy.pattern;

/**
 * ----------
 * Step 5
 * ----------
 * Represents a duck that uses a movement strategy to perform its move.
 */
class Duck {
    private final String name; // Name of the duck
    private MovementStrategy movementStrategy; // Current movement strategy

    /**
     * Constructs a duck with a name and an initial movement strategy.
     *
     * @param name     The name of the duck
     * @param strategy The initial movement strategy
     */
    public Duck(String name, MovementStrategy strategy) {
        this.name = name;
        this.movementStrategy = strategy;
        System.out.println(name + " is ready to compete!");
    }

    /**
     * Performs the move using the current movement strategy.
     */
    public void performMove() {
        System.out.println(this.name + " is preparing to move...");
        this.movementStrategy.move();
    }

    /**
     * Changes the movement strategy of the duck.
     *
     * @param strategy The new movement strategy
     */
    public void setMovementStrategy(MovementStrategy strategy) {
        this.movementStrategy = strategy;
        System.out.println(this.name + " changed strategy.");
    }
}
