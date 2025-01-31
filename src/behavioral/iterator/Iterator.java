package behavioral.iterator;

/**
 * ----------
 * Step 1
 * ----------
 * The Iterator interface defines methods for traversing elements in a collection.
 *
 * @param <T> The type of elements returned by this iterator
 */
public interface Iterator<T> {
    /**
     * Advances to the next element in the collection and returns it.
     * @return Next element in the collection, or null if no more elements exist
     */
    T next();

    /**
     * Checks if there are more elements to iterate over.
     * @return true if there are more elements, false otherwise
     */
    boolean hasNext();

    /**
     * Returns the current element without advancing the iterator.
     * @return Current element in the iteration, or null if position is invalid
     */
    T current();
}
