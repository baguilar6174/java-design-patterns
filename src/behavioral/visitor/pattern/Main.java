package behavioral.visitor.pattern;


/**
 * ----------
 * Step 9
 * ----------
 * Visitor Pattern implementation.
 */
public class Main {
    public static void main(String[] args) {
        Attraction[] attractions = { new RollerCoaster(), new HauntedHouse(), new FerrisWheel() };

        System.out.println("Roller Coaster: $" + new RollerCoaster().getPrice());
        System.out.println("Haunted House: $" + new HauntedHouse().getPrice());
        System.out.println("Ferris Wheel: $" + new FerrisWheel().getPrice());

        System.out.println("\nChild Visitor:");
        Visitor childVisitor = new ChildVisitor();
        for (Attraction attraction : attractions) {
            attraction.accept(childVisitor);
        }

        System.out.println("\nAdult Visitor:");
        Visitor adultVisitor = new AdultVisitor();
        for (Attraction attraction : attractions) {
            attraction.accept(adultVisitor);
        }

        System.out.println("\nSenior Visitor:");
        Visitor seniorVisitor = new SeniorVisitor();
        for (Attraction attraction : attractions) {
            attraction.accept(seniorVisitor);
        }
    }
}
