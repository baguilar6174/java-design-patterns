package creational.factorymethod.pattern;

import java.util.Scanner;

/**
 * ----------
 * Step 9
 * ----------
 * Utility class to demonstrate create a restaurant dynamically.
 * This class showcases the Factory Method Pattern in action.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Restaurant restaurant;

        System.out.print("Enter your hamburger type (chicken/beef/bean): ");
        String burgerType = scanner.nextLine();

        restaurant = switch (burgerType) {
            case "chicken" -> new ChickenRestaurant();
            case "beef" -> new BeefRestaurant();
            case "bean" -> new BeanRestaurant();
            default -> throw new RuntimeException("Invalid input");
        };

        restaurant.orderHamburger();

        /*
        * Result
        * Preparing bean | chicken | beef burger...
        * */
    }
}
