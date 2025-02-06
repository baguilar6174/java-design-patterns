package behavioral.visitor.task;

/**
 * EmissionCheckVisitor checks if vehicles pass emission regulations.
 */
class EmissionCheckVisitor implements Visitor {
    @Override
    public void visitCar(Car car) {
        boolean passes = car.year() > 2000 && car.kilometers() < 200000;
        System.out.println("Car passes emissions: " + (passes ? "Yes" : "No"));
    }

    @Override
    public void visitMotorcycle(Motorcycle motorcycle) {
        boolean passes = motorcycle.year() > 2005 && motorcycle.kilometers() < 100000;
        System.out.println("Motorcycle passes emissions: " + (passes ? "Yes" : "No"));
    }

    @Override
    public void visitTruck(Truck truck) {
        boolean passes = truck.year() > 2010 && truck.kilometers() < 300000;
        System.out.println("Truck passes emissions: " + (passes ? "Yes" : "No"));
    }
}
