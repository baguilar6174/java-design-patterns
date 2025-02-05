package behavioral.strategy.task;

// Strategy 3: Taxes in Germany
class GermanyTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.19;
    }
}