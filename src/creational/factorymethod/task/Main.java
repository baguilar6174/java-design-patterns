package creational.factorymethod.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ReportFactory factory;

        System.out.print("Enter your report type (sales/inventory): ");
        String reportType = scanner.nextLine();

        factory = switch (reportType) {
            case "sales" -> new SalesReportFactory();
            case "inventory" -> new InventoryFactorReport();
            default -> throw new RuntimeException("Invalid input");
        };

        factory.generateReport();
    }
}
