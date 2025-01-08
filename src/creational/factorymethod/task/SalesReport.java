package creational.factorymethod.task;

public class SalesReport implements Report {
    @Override
    public void generate() {
        System.out.println("Generating sales report...");
    }
}
