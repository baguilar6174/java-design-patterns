package creational.factorymethod.task;

public class InventoryReport implements Report {
    @Override
    public void generate() {
        System.out.println("Generating inventory report...");
    }
}
