package behavioral.visitor.task;

/**
 * Motorcycle class implementing Vehicle interface.
 */
record Motorcycle(int year, int kilometers) implements Vehicle {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitMotorcycle(this);
    }
}

