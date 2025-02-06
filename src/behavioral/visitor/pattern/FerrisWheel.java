package behavioral.visitor.pattern;

/**
 * ----------
 * Step 4
 * ----------
 * FerrisWheel attraction implementing Attraction interface.
 */
class FerrisWheel implements Attraction {

    @Override
    public double getPrice() {
        return 30.0;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitFerrisWheel(this);
    }
}