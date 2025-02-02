package behavioral.observer.pattern;

/**
 * ----------
 * Step 1
 * ----------
 * Represents an observer that can be notified of updates.
 */
public interface Observer {
    /**
     * Notifies the observer about a new event.
     *
     * @param title The title of the new video uploaded
     */
    void notify(String title);
}
