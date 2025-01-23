package structural.decorator.pattern;

/**
 * ----------
 * Step 1
 * ----------
 * The Notification interface represents the base component in the Decorator Design Pattern.
 * Classes implementing this interface will define how notifications are sent.
 */
public interface Notification {

    /**
     * Sends a notification with the specified message.
     *
     * @param message The message to be sent.
     */
    void send(String message);
}
