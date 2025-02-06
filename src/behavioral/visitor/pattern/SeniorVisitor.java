package behavioral.visitor.pattern;

/**
 * ----------
 * Step 8
 * ----------
 * SeniorVisitor applying senior discount.
 */
class SeniorVisitor implements Visitor {
    @Override
    public void visitRollerCoaster(RollerCoaster rollerCoaster) {
        System.out.println("Senior on Roller Coaster: Discounted price: $" + (rollerCoaster.getPrice() * 0.85));
    }

    @Override
    public void visitHauntedHouse(HauntedHouse hauntedHouse) {
        System.out.println("Senior in Haunted House: Discounted price: $" + (hauntedHouse.getPrice() * 0.85));
    }

    @Override
    public void visitFerrisWheel(FerrisWheel ferrisWheel) {
        System.out.println("Senior on Ferris Wheel: Discounted price: $" + (ferrisWheel.getPrice() * 0.85));
    }
}