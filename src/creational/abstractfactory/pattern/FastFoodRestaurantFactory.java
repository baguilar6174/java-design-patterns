package creational.abstractfactory.pattern;

/**
 * ----------
 * Step 9
 * ----------
 * Concrete Factory implementation for creating fast food items.
 * This factory creates a BeefHamburger and a CokeDrink.
 */
public class FastFoodRestaurantFactory implements RestaurantFactory {

    /**
     * Creates a BeefHamburger.
     *
     * @return a new instance of BeefHamburger.
     */
    @Override
    public Hamburger createHamburger() {
        return new BeefHamburger();
    }

    /**
     * Creates a CokeDrink.
     *
     * @return a new instance of CokeDrink.
     */
    @Override
    public Drink createDrink() {
        return new CokeDrink();
    }
}
