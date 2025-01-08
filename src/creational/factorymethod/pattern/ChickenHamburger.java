package creational.factorymethod.pattern;

/**
 * Concrete implementation of Hamburger representing a chicken hamburger.
 */
public class ChickenHamburger implements Hamburger {

    /**
     * Prepares the chicken hamburger.
     */
    @Override
    public void prepare() {
        System.out.println("Preparing chicken hamburger...");
    }
}
