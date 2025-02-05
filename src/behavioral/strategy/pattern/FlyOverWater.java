package behavioral.strategy.pattern;

/**
 * ----------
 * Step 3
 * ----------
 * Represents a moderately fast and moderately expensive movement strategy (flying).
 */
class FlyOverWater implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("The duck flies elegantly over the water.\n");
    }
}
