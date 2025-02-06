package behavioral.visitor.pattern;

/**
 * ----------
 * Step 3
 * ----------
 * HauntedHouse attraction implementing Attraction interface.
 */
class HauntedHouse implements Attraction {

    @Override
    public double getPrice() {
        return 40.0;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitHauntedHouse(this);
    }
}