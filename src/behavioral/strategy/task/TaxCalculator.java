package behavioral.strategy.task;

// Context Class - TaxCalculator
class TaxCalculator {
    private TaxStrategy strategy;

    // Constructor receiving the strategy to use
    public TaxCalculator(TaxStrategy strategy) {
        this.strategy = strategy;
    }

    // Change the tax calculation strategy
    public void setStrategy(TaxStrategy strategy) {
        this.strategy = strategy;
    }

    // Calculate tax
    public double calculate(double amount) {
        return this.strategy.calculateTax(amount);
    }
}
