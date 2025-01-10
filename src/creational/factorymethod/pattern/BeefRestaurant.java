package creational.factorymethod.pattern;

/**
 * ----------
 * Step 7
 * ----------
 * Concrete implementation of Restaurant specializing in beef hamburgers.
 * Implements the factory method to create BeefHamburger instances.
 */
public class BeefRestaurant extends Restaurant {

    /**
     * Factory method implementation to create a BeefHamburger.
     *
     * @return a new instance of BeefHamburger.
     */
    @Override
    public Hamburger createHamburger() {
        return new BeefHamburger();
    }
}
