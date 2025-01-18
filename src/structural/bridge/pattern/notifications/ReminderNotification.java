package structural.bridge.pattern.notifications;

import structural.bridge.pattern.Notification;
import structural.bridge.pattern.NotificationChannel;

/**
 * ----------
 * Step 10
 * ----------
 * The ReminderNotification class is a "Refined Abstraction" in the Bridge Pattern.
 * It provides additional functionality for reminder-specific notifications.
 */
public class ReminderNotification extends Notification {

    /**
     * Constructor for initializing reminder notifications with specific channel.
     *
     * @param channel A notifications channel to use.
     */
    public ReminderNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void setChannel(NotificationChannel channel) {
        this.channel = channel;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("\nReminder: ");
        this.channel.send(message);
    }
}
