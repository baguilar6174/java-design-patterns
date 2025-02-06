package behavioral.template.pattern;

/**
 * ----------
 * Step 2
 * ----------
 * Represents a tea beverage. It implements the specific steps for preparing tea.
 */
class Tea extends HotBeverage {
    /**
     * Adds the main ingredient for tea.
     */
    @Override
    protected void addMainIngredient() {
        System.out.println("Adding a tea bag");
    }

    /**
     * Adds condiments for tea.
     */
    @Override
    protected void addCondiments() {
        System.out.println("Adding honey and lemon");
    }
}