package structural.flyweight.pattern;

/**
 * ----------
 * Step 2
 * ----------
 * Concrete implementation of the Location interface.
 * Represents a reusable location icon with type and icon image.
 */
public class LocationIcon implements Location {
    private final String type; // Type of the location, e.g., "hospital", "park"
    private final String iconImage; // Path or name of the icon image file

    /**
     * Constructs a LocationIcon with the specified type and icon image.
     *
     * @param type the type of the location
     * @param iconImage the icon image associated with the location
     */
    public LocationIcon(String type, String iconImage) {
        this.type = type;
        this.iconImage = iconImage;
    }

    /**
     * Displays the location icon at the specified coordinates.
     *
     * @param coordinates the coordinates where the icon should be displayed
     */
    @Override
    public void display(Coordinates coordinates) {
        System.out.printf(
                "Coordinates: %s in %d, %d with icon [%s]%n",
                this.type, coordinates.latitude(), coordinates.longitude(), this.iconImage
        );
    }
}
