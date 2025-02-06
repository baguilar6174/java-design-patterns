package behavioral.template.pattern;

/**
 * ----------
 * Step 3
 * ----------
 * Represents a coffee beverage. It implements the specific steps for preparing coffee.
 */
class Coffee extends HotBeverage {
    /**
     * Adds the main ingredient for coffee.
     */
    @Override
    protected void addMainIngredient() {
        System.out.println("Adding ground coffee");
    }

    /**
     * Adds condiments for coffee.
     */
    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}

