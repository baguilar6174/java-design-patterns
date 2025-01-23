package structural.decorator.pattern;

/**
 * ----------
 * Step 3
 * ----------
 * NotificationDecorator is an abstract class that implements the Notification interface.
 * It acts as a base class for concrete decorators, allowing additional behavior to be added
 * to notifications dynamically.
 */
public abstract class NotificationDecorator implements Notification {

    // The wrapped Notification component
    protected Notification notification;

    /**
     * Constructs a NotificationDecorator with a wrapped Notification object.
     *
     * @param notification The notification object to decorate.
     */
    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send(String message) {
        // Delegates the send action to the wrapped notification
        this.notification.send(message);
    }
}
