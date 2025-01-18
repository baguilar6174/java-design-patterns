package structural.bridge.pattern.notifications;

import structural.bridge.pattern.Notification;
import structural.bridge.pattern.NotificationChannel;

/**
 * ----------
 * Step 9
 * ----------
 * The PushNotification class is a "Refined Abstraction" in the Bridge Pattern.
 * It provides additional functionality for push-specific notifications.
 */
public class PushNotification extends Notification {

    /**
     * Constructor for initializing push notifications with specific channel.
     *
     * @param channel A notifications channel to use.
     */
    public PushNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void setChannel(NotificationChannel channel) {
        this.channel = channel;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("\nPush notifications: ");
        this.channel.send(message);
    }
}
