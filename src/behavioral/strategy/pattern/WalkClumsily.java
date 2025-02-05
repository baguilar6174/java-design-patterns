package behavioral.strategy.pattern;

/**
 * ----------
 * Step 4
 * ----------
 * Represents a slow and economical movement strategy (walking).
 */
class WalkClumsily implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("The duck walks clumsily along the shore.\n");
    }
}
