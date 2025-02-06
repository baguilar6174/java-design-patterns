package behavioral.visitor.pattern;

/**
 * ----------
 * Step 5
 * ----------
 * Visitor Interface defining visit methods for different attractions.
 */
interface Visitor {
    void visitRollerCoaster(RollerCoaster rollerCoaster);
    void visitHauntedHouse(HauntedHouse hauntedHouse);
    void visitFerrisWheel(FerrisWheel ferrisWheel);
}
