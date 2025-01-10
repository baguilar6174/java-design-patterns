package creational.factorymethod.pattern;

/**
 * ----------
 * Step 5
 * ----------
 * Abstract class representing a Restaurant.
 * This class defines the Factory Method Pattern by providing an abstract method `createHamburger`
 * that must be implemented by concrete restaurants to create specific types of hamburgers.
 */
public abstract class Restaurant {

    /**
     * Factory method to create a Hamburger. This method is abstract and must be implemented
     * by subclasses to create specific types of hamburgers.
     *
     * @return a Hamburger instance created by the specific restaurant.
     */
    protected abstract Hamburger createHamburger();

    /**
     * Template method to order a hamburger. This method calls the factory method to create
     * a hamburger and then prepares it.
     */
    public void orderHamburger() {
        // Use the factory method to create a Hamburger instance
        Hamburger hamburger = this.createHamburger();
        hamburger.prepare();
    }
}
