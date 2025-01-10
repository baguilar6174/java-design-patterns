package creational.abstractfactory.pattern;

/**
 * ----------
 * Step 5
 * ----------
 * Concrete implementation of Drink representing a glass of water.
 */
public class WaterDrink implements Drink{

    /**
     * Pours a glass of water.
     */
    @Override
    public void pour() {
        System.out.println("Pouring a glass of water...");
    }
}
