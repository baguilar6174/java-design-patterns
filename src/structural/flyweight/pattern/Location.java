package structural.flyweight.pattern;

/**
 * ----------
 * Step 1
 * ----------
 * Represents a location on a map.
 * Flyweight pattern interface to define behavior for displaying locations.
 */
public interface Location {

    /**
     * Displays the location at the given coordinates.
     *
     * @param coordinates the coordinates where the location should be displayed
     */
    void display(Coordinates coordinates);

    /**
     * Represents the geographical coordinates with latitude and longitude.
     * A simple immutable record to encapsulate latitude and longitude values.
     */
    record Coordinates(int latitude, int longitude) {}
}
