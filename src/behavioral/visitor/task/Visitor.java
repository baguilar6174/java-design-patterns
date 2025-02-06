package behavioral.visitor.task;

/**
 * Visitor interface defining visit methods for different vehicle types.
 */
interface Visitor {
    void visitCar(Car car);
    void visitMotorcycle(Motorcycle motorcycle);
    void visitTruck(Truck truck);
}
