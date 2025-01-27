package structural.flyweight.pattern;

import java.util.List;

/**
 * ----------
 * Step 5
 * ----------
 * Demonstrates the Flyweight task with locations and icons.
 */
public class Main {
    public static void main(String[] args) {

        LocationFactory factory = new LocationFactory();

        // Create and display multiple locations using shared icons
        List<MapLocation> locations =  List.of(
                new MapLocation(new Location.Coordinates(10, 20), factory.getLocationIcon("hospital")),
                new MapLocation(new Location.Coordinates(15, 40), factory.getLocationIcon("hospital")),
                new MapLocation(new Location.Coordinates(115, 490), factory.getLocationIcon("park"))
        );

        // Display all locations
        locations.forEach(MapLocation::display);

        /*
        * Result:
        *
        * Creating hospital icon instance....
        * Creating park icon instance....
        * Coordinates: hospital in 10, 20 with icon [image_fom_hospital.png]
        * Coordinates: hospital in 15, 40 with icon [image_fom_hospital.png]
        * Coordinates: park in 115, 490 with icon [image_fom_park.png]
        * */
    }
}
