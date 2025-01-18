package structural.bridge.pattern.notifications;

import structural.bridge.pattern.NotificationChannel;
import structural.bridge.pattern.Notifications;

import java.util.List;

/**
 * ----------
 * Step 8
 * ----------
 * The AlertNotifications class is a "Refined Abstraction" in the Bridge Pattern.
 * It provides additional functionality for alert-specific notifications.
 */
public class AlertNotifications extends Notifications {

    /**
     * Constructor for initializing alert notifications with specific channels.
     *
     * @param channels A list of notifications channels to use.
     */
    public AlertNotifications(List<NotificationChannel> channels) {
        super(channels);
    }

    @Override
    public void addChannel(NotificationChannel channel) {
        this.channels.add(channel);
    }

    @Override
    public void sendNotifications(String message) {
        System.out.println("\nAlert notifications: ");
        this.channels.forEach(channel -> channel.send(message));
    }
}
