package structural.bridge.pattern.channels;

import structural.bridge.pattern.NotificationChannel;

/**
 * ----------
 * Step 4
 * ----------
 * Concrete implementation of NotificationChannel for Push notifications.
 */
public class PushNotificationChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending push notifications: " + message);
    }
}
