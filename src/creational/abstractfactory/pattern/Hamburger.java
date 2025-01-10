package creational.abstractfactory.pattern;

/**
 * ----------
 * Step 1
 * ----------
 * Interface representing a generic Hamburger.
 * All specific types of hamburgers should implement this interface.
 */
public interface Hamburger {

    /**
     * Prepares the hamburger. This method should be implemented by all concrete hamburgers.
     */
    void prepare();
}
