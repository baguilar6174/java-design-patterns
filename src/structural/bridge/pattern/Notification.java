package structural.bridge.pattern;

/**
 * ----------
 * Step 5
 * ----------
 * The Notification class acts as the "Abstraction" in the Bridge Pattern.
 * It defines the high-level interface for sending notifications using a channel.
 */
public abstract class Notification {

    /**
     * Notification channel used by this abstraction.
     */
    protected NotificationChannel channel;

    /**
     * Constructor for initializing the notifications channel.
     *
     * @param channel A notifications channel to use.
     */
    public Notification(NotificationChannel channel) {
        this.channel = channel;
    }

    /**
     * Set a notifications channel.
     *
     * @param channel The notifications channel to set.
     */
    public abstract void setChannel(NotificationChannel channel);

    /**
     * Sends a notifications message through available channel.
     *
     * @param message The message to send.
     */
    public abstract void sendNotification(String message);
}
