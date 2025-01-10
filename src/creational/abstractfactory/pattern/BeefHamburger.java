package creational.abstractfactory.pattern;

/**
 * ----------
 * Step 3
 * ----------
 * Concrete implementation of Hamburger representing a beef hamburger.
 */
public class BeefHamburger implements Hamburger {

    /**
     * Prepares the beef hamburger.
     */
    @Override
    public void prepare() {
        System.out.println("Preparing beef hamburger...");
    }
}
