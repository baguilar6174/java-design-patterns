package behavioral.strategy.task;

public class Main {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator(new USATaxStrategy());

        System.out.println("Tax Calculation:");
        System.out.println("USA: $" + String.format("%.2f", taxCalculator.calculate(100)));

        System.out.println("\nSwitching to strategy for Canada...");
        taxCalculator.setStrategy(new CanadaTaxStrategy());
        System.out.println("Canada: $" + String.format("%.2f", taxCalculator.calculate(100)));

        System.out.println("\nSwitching to strategy for Germany...");
        taxCalculator.setStrategy(new GermanyTaxStrategy());
        System.out.println("Germany: $" + String.format("%.2f", taxCalculator.calculate(100)));
    }
}
