package behavioral.iterator;

/**
 * ----------
 * Step 4
 * ----------
 * Concrete iterator implementation for Pokémon collections.
 * Implements the Iterator role in the Iterator pattern.
 */
public class PokemonIterator implements Iterator<Pokemon> {
    private final PokemonCollection collection;
    private int position;

    /**
     * Constructs an iterator for the specified Pokémon collection.
     * @param collection Collection to iterate over
     */
    public PokemonIterator(PokemonCollection collection) {
        this.collection = collection;
        this.position = 0;
    }

    /**
     * Advances to the next Pokémon in the collection.
     * @return Next Pokémon in the sequence, or null if at end
     */
    @Override
    public Pokemon next() {
        if (this.hasNext()) {
            return this.collection.getAt(this.position++);
        }
        return null;
    }

    /**
     * Checks if more Pokémon exist in the collection.
     * @return true if more elements are available, false otherwise
     */
    @Override
    public boolean hasNext() {
        return this.position < this.collection.getLength();
    }

    /**
     * Returns the current Pokémon without advancing the iterator.
     * @return Current Pokémon in the iteration sequence
     */
    @Override
    public Pokemon current() {
        return this.collection.getAt(this.position);
    }
}
