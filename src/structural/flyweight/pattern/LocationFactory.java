package structural.flyweight.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * ----------
 * Step 3
 * ----------
 * Factory class to manage and create LocationIcon instances.
 * Implements the Flyweight pattern by reusing instances of LocationIcon.
 */
public class LocationFactory {
    private final Map<String, LocationIcon> icons = new HashMap<>(); // Cache for storing created icons

    /**
     * Retrieves a LocationIcon of the specified type, creating it if necessary.
     *
     * @param type the type of the location icon to retrieve
     * @return a LocationIcon instance for the specified type
     */
    public LocationIcon getLocationIcon(String type) {
        if (!this.icons.containsKey(type)) {
            System.out.printf("Creating %s icon instance....%n", type);
            String iconImage = "image_from_" + type.toLowerCase() + ".png"; // Simulated icon file name
            this.icons.put(type, new LocationIcon(type, iconImage));
        }
        return icons.get(type);
    }
}
