package behavioral.strategy.pattern;

/**
 * ----------
 * Step 6
 * ----------
 * Client code to demonstrate the Strategy Pattern.
 */
public class Main {
    public static void main(String[] args) {
        // Create ducks with different movement strategies
        Duck duck1 = new Duck("Fast Duck", new SwimFast());
        Duck duck2 = new Duck("Flying Duck", new FlyOverWater());
        Duck duck3 = new Duck("Clumsy Duck", new WalkClumsily());

        System.out.println("The duck race begins!");
        duck1.performMove();
        duck2.performMove();
        duck3.performMove();

        // Change the strategy of the clumsy duck
        duck3.setMovementStrategy(new FlyOverWater());
        duck3.performMove();

        duck3.setMovementStrategy(new SwimFast());
        duck3.performMove();

        /*
        * Result:
        *
        * Fast Duck is ready to compete!
        * Flying Duck is ready to compete!
        * Clumsy Duck is ready to compete!
        * The duck race begins!
        * Fast Duck is preparing to move...
        * The duck swims quickly on the water.
        *
        * Flying Duck is preparing to move...
        * The duck flies elegantly over the water.
        *
        * Clumsy Duck is preparing to move...
        * The duck walks clumsily along the shore.
        *
        * Clumsy Duck changed strategy.
        * Clumsy Duck is preparing to move...
        * The duck flies elegantly over the water.
        *
        * Clumsy Duck changed strategy.
        * Clumsy Duck is preparing to move...
        * The duck swims quickly on the water.
        * */
    }
}