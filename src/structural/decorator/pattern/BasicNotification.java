package structural.decorator.pattern;

/**
 * ----------
 * Step 2
 * ----------
 * BasicNotification is a concrete implementation of the Notification interface.
 * This class provides the basic functionality of sending a notification.
 */
public class BasicNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending basic notification: " + message);
    }
}
