package behavioral.strategy.pattern;

/**
 * ----------
 * Step 2
 * ----------
 * Represents a fast but expensive movement strategy (swimming).
 */
class SwimFast implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("The duck swims quickly on the water.\n");
    }
}
