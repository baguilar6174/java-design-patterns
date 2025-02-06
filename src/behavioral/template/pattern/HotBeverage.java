package behavioral.template.pattern;

/**
 * ----------
 * Step 1
 * ----------
 * Abstract class representing a hot beverage.
 * It defines the template method `prepare` that outlines the steps to prepare the beverage.
 */
abstract class HotBeverage {
    /**
     * The template method that defines the steps to prepare the beverage.
     * This method is final to prevent subclasses from changing the algorithm's structure.
     */
    public final void prepare() {
        this.boilWater();
        this.addMainIngredient();
        this.pourInCup();
        this.addCondiments();
    }

    /**
     * Boils water. This step is common for all hot beverages.
     */
    private void boilWater() {
        System.out.println("Boiling water...");
    }

    /**
     * Pours the beverage into a cup. This step is common for all hot beverages.
     */
    private void pourInCup() {
        System.out.println("Pouring into the cup...");
    }

    /**
     * Adds the main ingredient to the beverage. This step is specific to each beverage.
     */
    protected abstract void addMainIngredient();

    /**
     * Adds condiments to the beverage. This step is specific to each beverage.
     */
    protected abstract void addCondiments();
}