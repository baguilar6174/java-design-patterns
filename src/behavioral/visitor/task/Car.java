package behavioral.visitor.task;

/**
 * Car class implementing Vehicle interface.
 */
record Car(int year, int kilometers) implements Vehicle {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCar(this);
    }
}
