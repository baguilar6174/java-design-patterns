package behavioral.visitor.task;

/**
 * Truck class implementing Vehicle interface.
 */
record Truck(int year, int kilometers, int loadCapacity) implements Vehicle {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTruck(this);
    }
}

