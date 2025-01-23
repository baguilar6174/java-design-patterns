package structural.decorator.pattern;

/**
 * ----------
 * Step 5
 * ----------
 * SMSDecorator is a concrete decorator that extends the functionality of a Notification
 * by adding the ability to send SMS notifications.
 */
public class SMSDecorator extends NotificationDecorator {

    /**
     * Constructs an SMSDecorator with a wrapped Notification object.
     *
     * @param notification The notification object to decorate.
     */
    public SMSDecorator(Notification notification) {
        super(notification);
    }

    /**
     * Sends an SMS notification with the specified message.
     *
     * @param message The message to be sent via SMS.
     */
    private void sendSMS(String message) {
        System.out.println("Sending SMS..." + message);
    }

    @Override
    public void send(String message) {
        // Sends the base notification
        super.send(message);
        // Adds additional SMS sending functionality
        this.sendSMS(message);
    }
}
