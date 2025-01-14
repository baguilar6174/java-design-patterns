package creational.factoryfunction.pattern;

import java.util.function.Function;

/**
 * ----------
 * Step 3
 * ----------
 * Demonstrates the Factory Function Pattern by creating a greeter function
 * based on the specified language.
 */
public class Main {

    public static void main(String[] args) {
        // Create a greeter function for Spanish
        Function<String, String> greeter = Greeter.createGreeter(Language.ES);
        // Use the greeter function to print a greeting message
        System.out.println(greeter.apply("Bryan"));
    }
}
