package behavioral.observer.pattern;

/**
 * ----------
 * Step 3
 * ----------
 * Represents a subscriber (observer) that receives notifications from a YouTube channel.
 */
public class Subscriber implements Observer {
    private final String name; // Name of the subscriber

    /**
     * Constructs a subscriber with the specified name.
     *
     * @param name The name of the subscriber
     */
    public Subscriber(String name) {
        this.name = name;
    }

    /**
     * Notifies the subscriber about a new video upload.
     *
     * @param title The title of the new video
     */
    @Override
    public void notify(String title) {
        System.out.printf("%s has been notified: New video %s%n", this.name, title);
    }
}