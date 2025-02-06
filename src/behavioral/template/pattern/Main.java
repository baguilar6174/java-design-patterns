package behavioral.template.pattern;

/**
 * ----------
 * Step 4
 * ----------
 * Client code to demonstrate the Template Method Pattern.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Preparing tea...");
        Tea tea = new Tea();
        tea.prepare();

        System.out.println("\nPreparing coffee...");
        Coffee coffee = new Coffee();
        coffee.prepare();

        /*
        * Result:
        *
        * Preparing tea...
        * Boiling water...
        * Adding a tea bag
        * Pouring into the cup...
        * Adding honey and lemon
        *
        * Preparing coffee...
        * Boiling water...
        * Adding ground coffee
        * Pouring into the cup...
        * Adding sugar and milk
        * */
    }
}
