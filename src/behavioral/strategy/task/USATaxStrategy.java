package behavioral.strategy.task;

// Strategy 1: Taxes in USA
class USATaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.1;
    }
}