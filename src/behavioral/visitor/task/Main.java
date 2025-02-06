package behavioral.visitor.task;

public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car(2000, 150000),
                new Motorcycle(2015, 30000),
                new Truck(2012, 250000, 20)
        };

        System.out.println("\nCalculating Maintenance Costs:");
        Visitor maintenanceVisitor = new MaintenanceCostVisitor();
        for (Vehicle vehicle : vehicles) {
            vehicle.accept(maintenanceVisitor);
        }

        System.out.println("\nChecking Emissions:");
        Visitor emissionVisitor = new EmissionCheckVisitor();
        for (Vehicle vehicle : vehicles) {
            vehicle.accept(emissionVisitor);
        }
    }
}
