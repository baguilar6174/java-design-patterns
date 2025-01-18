package structural.bridge.pattern;

/**
 * ----------
 * Step 1
 * ----------
 * The NotificationChannel interface acts as the "Implementor" in the Bridge Pattern.
 * It defines a common interface for different types of notifications channels.
 */
public interface NotificationChannel {
    void send(String message);
}
