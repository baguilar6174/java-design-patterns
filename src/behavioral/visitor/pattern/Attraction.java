package behavioral.visitor.pattern;

/**
 * ----------
 * Step 1
 * ----------
 * Attraction Interface with an accept method for visitors and a method to get the price.
 */
interface Attraction {
    void accept(Visitor visitor);
    double getPrice();
}

