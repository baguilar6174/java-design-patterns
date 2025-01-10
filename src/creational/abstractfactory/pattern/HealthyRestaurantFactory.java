package creational.abstractfactory.pattern;

/**
 * ----------
 * Step 8
 * ----------
 * Concrete Factory implementation for creating healthy food items.
 * This factory creates a ChickenHamburger and a WaterDrink.
 */
public class HealthyRestaurantFactory implements RestaurantFactory {

    /**
     * Creates a ChickenHamburger.
     *
     * @return a new instance of ChickenHamburger.
     */
    @Override
    public Hamburger createHamburger() {
        return new ChickenHamburger();
    }

    /**
     * Creates a WaterDrink.
     *
     * @return a new instance of WaterDrink.
     */
    @Override
    public Drink createDrink() {
        return new WaterDrink();
    }
}
