package creational.factorymethod.task;

public class InventoryFactorReport extends ReportFactory {
    @Override
    protected Report createReport() {
        return new InventoryReport();
    }
}
