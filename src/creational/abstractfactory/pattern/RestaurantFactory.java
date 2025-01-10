package creational.abstractfactory.pattern;

/**
 * ----------
 * Step 7
 * ----------
 * Abstract Factory interface for creating related objects (Hamburger and Drink).
 * Specific factories will implement this interface to create specific combinations
 * of hamburgers and drinks.
 */
public interface RestaurantFactory {

    /**
     * Factory method to create a Hamburger.
     *
     * @return a Hamburger instance.
     */
    Hamburger createHamburger();

    /**
     * Factory method to create a Drink.
     *
     * @return a Drink instance.
     */
    Drink createDrink();
}
