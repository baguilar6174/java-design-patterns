package structural.bridge.pattern;

import java.util.List;

/**
 * ----------
 * Step 6
 * ----------
 * The Notifications class acts as the "Abstraction" in the Bridge Pattern.
 * It defines the high-level interface for sending notifications using various channels.
 */
public abstract class Notifications {

    /**
     * List of notifications channels used by this abstraction.
     */
    protected List<NotificationChannel> channels;

    /**
     * Constructor for initializing the notifications channels.
     *
     * @param channels A list of notifications channels to use.
     */
    public Notifications(List<NotificationChannel> channels) {
        this.channels = channels;
    }

    /**
     * Adds a notifications channel to the list of channels.
     *
     * @param channel The notifications channel to add.
     */
    public abstract void addChannel(NotificationChannel channel);

    /**
     * Sends a notifications message through all available channels.
     *
     * @param message The message to send.
     */
    public abstract void sendNotifications(String message);
}
