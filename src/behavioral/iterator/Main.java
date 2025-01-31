package behavioral.iterator;

/**
 * ----------
 * Step 5
 * ----------
 * Iterator pattern implementation.
 */
public class Main {
    public static void main(String[] args) {

        // Create and populate Pokémon collection
        PokemonCollection collection = new PokemonCollection();

        collection.add(new Pokemon("Pikachu", "Electric"));
        collection.add(new Pokemon("Charmander", "Fire"));
        collection.add(new Pokemon("Squirtle", "Water"));
        collection.add(new Pokemon("Bulbasaur", "Plant"));

        // Create iterator for traversal
        PokemonIterator iterator = collection.createIterator();

        // Iterate through collection using the iterator
        System.out.println("Pokémon Collection:");
        while (iterator.hasNext()) {
            Pokemon pokemon = iterator.next();
            // Null check ensures safe handling of potential edge cases
            if (pokemon != null) {
                System.out.printf("Pokemon: %s, Type: %s%n", pokemon.name, pokemon.type);
            }
        }

        /*
        * Result:
        *
        * Pokémon Collection:
        * Pokemon: Pikachu, Type: Electric
        * Pokemon: Charmander, Type: Fire
        * Pokemon: Squirtle, Type: Water
        * Pokemon: Bulbasaur, Type: Plant
        * */
    }
}
