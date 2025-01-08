package creational.factorymethod.pattern;

/**
 * Concrete implementation of Restaurant specializing in chicken hamburgers.
 * Implements the factory method to create ChickenHamburger instances.
 */
public class ChickenRestaurant extends Restaurant {

    /**
     * Factory method implementation to create a ChickenHamburger.
     *
     * @return a new instance of ChickenHamburger.
     */
    @Override
    public Hamburger createHamburger() {
        return new ChickenHamburger();
    }
}
