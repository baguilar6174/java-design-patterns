package structural.bridge.pattern.notifications;

import structural.bridge.pattern.Notification;
import structural.bridge.pattern.NotificationChannel;

/**
 * ----------
 * Step 7
 * ----------
 * The AlertNotification class is a "Refined Abstraction" in the Bridge Pattern.
 * It provides additional functionality for alert-specific notifications.
 */
public class AlertNotification extends Notification {

    /**
     * Constructor for initializing alert notifications with specific channel.
     *
     * @param channel A notifications channel to use.
     */
    public AlertNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void setChannel(NotificationChannel channel) {
        this.channel = channel;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("\nAlert: ");
        this.channel.send(message);
    }
}
