package structural.bridge.pattern.channels;

import structural.bridge.pattern.NotificationChannel;

/**
 * ----------
 * Step 3
 * ----------
 * Concrete implementation of NotificationChannel for SMS notifications.
 */
public class SMSChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
