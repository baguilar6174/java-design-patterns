package creational.abstractfactory.pattern;

/**
 * ----------
 * Step 4
 * ----------
 * Interface representing a generic Drink.
 * All specific types of drinks should implement this interface.
 */
public interface Drink {

    /**
     * Pours the drink. This method should be implemented by all concrete drinks.
     */
    void pour();
}
