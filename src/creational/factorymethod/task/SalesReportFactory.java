package creational.factorymethod.task;

public class SalesReportFactory extends ReportFactory{
    @Override
    protected Report createReport() {
        return new SalesReport();
    }
}
