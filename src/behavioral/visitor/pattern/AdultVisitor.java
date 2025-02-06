package behavioral.visitor.pattern;

/**
 * ----------
 * Step 7
 * ----------
 * AdultVisitor applying no discount for adults.
 */
class AdultVisitor implements Visitor {
    @Override
    public void visitRollerCoaster(RollerCoaster rollerCoaster) {
        System.out.println("Adult on Roller Coaster: Price: $" + rollerCoaster.getPrice());
    }

    @Override
    public void visitHauntedHouse(HauntedHouse hauntedHouse) {
        System.out.println("Adult in Haunted House: Price: $" + hauntedHouse.getPrice());
    }

    @Override
    public void visitFerrisWheel(FerrisWheel ferrisWheel) {
        System.out.println("Adult on Ferris Wheel: Price: $" + ferrisWheel.getPrice());
    }
}
