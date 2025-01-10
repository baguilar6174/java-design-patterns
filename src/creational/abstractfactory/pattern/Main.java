package creational.abstractfactory.pattern;

/**
 * ----------
 * Step 10
 * ----------
 * Utility class to demonstrate ordering food using different restaurant factories.
 * This class showcases the Abstract Factory Pattern in action.
 */
public class Main {

    /**
     * Orders a hamburger and a drink from the given restaurant factory.
     *
     * @param restaurantFactory the factory used to create the hamburger and drink.
     */
    public static void order(RestaurantFactory restaurantFactory) {
        // Create a hamburger using the provided factory
        Hamburger hamburger = restaurantFactory.createHamburger();
        // Create a drink using the provided factory
        Drink drink = restaurantFactory.createDrink();
        hamburger.prepare();
        drink.pour();
    }

    public static void main(String[] args) {
        // Create a factory for fast food
        RestaurantFactory fastFoodRestaurant = new FastFoodRestaurantFactory();
        // Order food using the fast food factory
        order(fastFoodRestaurant);

        System.out.println("-----------------------------------------");

        // Create a factory for healthy food
        RestaurantFactory healthyRestaurant = new HealthyRestaurantFactory();
        // Order food using the healthy restaurant factory
        order(healthyRestaurant);
    }
}
