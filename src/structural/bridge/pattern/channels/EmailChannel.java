package structural.bridge.pattern.channels;

import structural.bridge.pattern.NotificationChannel;

/**
 * ----------
 * Step 2
 * ----------
 * Concrete implementation of NotificationChannel for email notifications.
 */
public class EmailChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
