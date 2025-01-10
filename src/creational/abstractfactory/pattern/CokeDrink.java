package creational.abstractfactory.pattern;

/**
 * ----------
 * Step 6
 * ----------
 * Concrete implementation of Drink representing a glass of coke.
 */
public class CokeDrink implements Drink {

    /**
     * Pours a glass of coke.
     */
    @Override
    public void pour() {
        System.out.println("Pouring a glass of Coca Cola...");
    }
}
