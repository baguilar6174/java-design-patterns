package structural.decorator.pattern;

/**
 * ----------
 * Step 6
 * ----------
 * Demonstrates the usage of the Decorator Design Pattern to dynamically add
 * notification sending functionalities.
 */
public class Main {
    public static void main(String[] args) {

        // Create a basic notification
        Notification notification = new BasicNotification();
        // Add email notification functionality
        notification = new EmailDecorator(notification);
        // Add SMS notification functionality
        notification = new SMSDecorator(notification);
        // Send a decorated notification
        notification.send("New message!");

        /*
        * Result:
        *
        * Sending basic notification: New message!
        * Sending email...New message!
        * Sending SMS...New message!
        * */
    }
}
