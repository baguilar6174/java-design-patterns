package behavioral.strategy.task;

// Strategy 2: Taxes in Canada
class CanadaTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        return amount * 0.13;
    }
}
