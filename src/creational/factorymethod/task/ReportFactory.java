package creational.factorymethod.task;

public abstract class ReportFactory {
    protected abstract Report createReport();

    public void generateReport() {
        Report report = this.createReport();
        report.generate();
    }
}
