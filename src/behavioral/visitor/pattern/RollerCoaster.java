package behavioral.visitor.pattern;

/**
 * ----------
 * Step 2
 * ----------
 * RollerCoaster attraction implementing Attraction interface.
 */
class RollerCoaster implements Attraction {

    @Override
    public double getPrice() {
        return 50.0;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRollerCoaster(this);
    }
}
