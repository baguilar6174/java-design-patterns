package behavioral.visitor.pattern;

/**
 * ----------
 * Step 6
 * ----------
 * ChildVisitor applying discounts for children.
 */
class ChildVisitor implements Visitor {
    @Override
    public void visitRollerCoaster(RollerCoaster rollerCoaster) {
        System.out.println("Child on Roller Coaster: Discounted price: $" + (rollerCoaster.getPrice() * 0.5));
    }

    @Override
    public void visitHauntedHouse(HauntedHouse hauntedHouse) {
        System.out.println("Child in Haunted House: Discounted price: $" + (hauntedHouse.getPrice() * 0.7));
    }

    @Override
    public void visitFerrisWheel(FerrisWheel ferrisWheel) {
        System.out.println("Child on Ferris Wheel: Discounted price: $" + (ferrisWheel.getPrice() * 0.6));
    }
}
