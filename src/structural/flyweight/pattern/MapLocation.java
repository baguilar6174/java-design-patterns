package structural.flyweight.pattern;

/**
 * ----------
 * Step 4
 * ----------
 * Represents a specific location on a map with coordinates and an associated icon.
 */
public class MapLocation {
    private final Location.Coordinates coordinates; // Geographical coordinates of the location
    private final LocationIcon locationIcon; // Icon to represent this location on the map

    /**
     * Constructs a MapLocation with the specified coordinates and location icon.
     *
     * @param coordinates the geographical coordinates of the location
     * @param locationIcon the icon representing this location
     */
    public MapLocation(Location.Coordinates coordinates, LocationIcon locationIcon) {
        this.coordinates = coordinates;
        this.locationIcon = locationIcon;
    }

    /**
     * Displays the location on the map.
     */
    public void display() {
        this.locationIcon.display(this.coordinates);
    }
}
