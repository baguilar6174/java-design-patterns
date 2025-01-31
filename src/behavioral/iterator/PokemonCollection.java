package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * ----------
 * Step 3
 * ----------
 * Represents a collection of Pokémon objects that can be iterated.
 * Implements the Iterable role in the Iterator pattern.
 */
public class PokemonCollection {
    private final List<Pokemon> pokemons = new ArrayList<>();

    /**
     * Adds a Pokémon to the collection.
     * @param pokemon Pokémon to add to the collection
     */
    public void add(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    /**
     * Retrieves a Pokémon at a specific index.
     * @param index Position in the collection
     * @return Pokémon at specified index, or null if index is invalid
     */
    public Pokemon getAt(int index) {
        if (index >= 0 && index < this.pokemons.size()) {
            return this.pokemons.get(index);
        }
        return null;
    }

    /**
     * Gets the total number of Pokémon in the collection.
     * @return Size of the collection
     */
    public int getLength() {
        return this.pokemons.size();
    }

    /**
     * Creates a new iterator for this collection.
     * @return Iterator object for traversing the collection
     */
    public PokemonIterator createIterator() {
        return new PokemonIterator(this);
    }
}
