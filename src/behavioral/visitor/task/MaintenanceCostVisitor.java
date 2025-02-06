package behavioral.visitor.task;

/**
 * MaintenanceCostVisitor calculates maintenance costs for vehicles.
 */
class MaintenanceCostVisitor implements Visitor {
    @Override
    public void visitCar(Car car) {
        double cost = car.kilometers() * 0.1 + (2024 - car.year()) * 50;
        System.out.println("Maintenance cost for Car: $" + String.format("%.2f", cost));
    }

    @Override
    public void visitMotorcycle(Motorcycle motorcycle) {
        double cost = motorcycle.kilometers() * 0.05 + (2024 - motorcycle.year()) * 30;
        System.out.println("Maintenance cost for Motorcycle: $" + String.format("%.2f", cost));
    }

    @Override
    public void visitTruck(Truck truck) {
        double cost = truck.kilometers() * 0.15 + truck.loadCapacity() * 20 + (2024 - truck.year()) * 100;
        System.out.println("Maintenance cost for Truck: $" + String.format("%.2f", cost));
    }
}
