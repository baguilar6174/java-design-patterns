package creational.factorymethod.pattern;

/**
 * Concrete implementation of Restaurant specializing in bean hamburgers.
 * Implements the factory method to create BeanHamburger instances.
 */
public class BeanRestaurant extends Restaurant {

    /**
     * Factory method implementation to create a BeanHamburger.
     *
     * @return a new instance of BeanHamburger.
     */
    @Override
    public Hamburger createHamburger() {
        return new BeanHamburger();
    }
}
