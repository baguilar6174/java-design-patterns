package structural.decorator.pattern;

/**
 * ----------
 * Step 4
 * ----------
 * EmailDecorator is a concrete decorator that extends the functionality of a Notification
 * by adding the ability to send email notifications.
 */
public class EmailDecorator extends NotificationDecorator {

    /**
     * Constructs an EmailDecorator with a wrapped Notification object.
     *
     * @param notification The notification object to decorate.
     */
    public EmailDecorator(Notification notification) {
        super(notification);
    }

    /**
     * Sends an email notification with the specified message.
     *
     * @param message The message to be sent via email.
     */
    private void sendEmail(String message) {
        System.out.println("Sending email..." + message);
    }

    @Override
    public void send(String message) {
        // Sends the base notification
        super.send(message);
        // Adds additional email sending functionality
        this.sendEmail(message);
    }
}
