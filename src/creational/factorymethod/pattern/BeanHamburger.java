package creational.factorymethod.pattern;

/**
 * Concrete implementation of Hamburger representing a bean hamburger.
 */
public class BeanHamburger implements Hamburger {

    /**
     * Prepares the bean hamburger.
     */
    @Override
    public void prepare() {
        System.out.println("Preparing bean hamburger...");
    }
}
