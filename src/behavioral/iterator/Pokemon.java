package behavioral.iterator;

/**
 * ----------
 * Step 2
 * ----------
 * Represents a Pokémon character with basic attributes.
 */
public class Pokemon {
    public String name;
    public String type;

    /**
     * Constructs a Pokémon with specified characteristics.
     * @param name Pokémon's name
     * @param type Pokémon's elemental type
     */
    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
