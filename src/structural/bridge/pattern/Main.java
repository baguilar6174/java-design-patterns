package structural.bridge.pattern;

import structural.bridge.pattern.channels.EmailChannel;
import structural.bridge.pattern.channels.PushNotificationChannel;
import structural.bridge.pattern.channels.SMSChannel;
import structural.bridge.pattern.notifications.AlertNotification;
import structural.bridge.pattern.notifications.AlertNotifications;
import structural.bridge.pattern.notifications.PushNotification;
import structural.bridge.pattern.notifications.ReminderNotification;

import java.util.List;

/**
 * ----------
 * Step 11
 * ----------
 * Demonstrate the Bridge Pattern with notifications.
 */
public class Main {
    public static void main(String[] args) {
        Notification alert = new AlertNotification(new EmailChannel());
        alert.sendNotification("Security alert!");
        /*
         * Result:
         *
         * Alert:
         * Sending email: Security alert!
         * */

        alert.setChannel(new SMSChannel());

        alert.sendNotification("Security alert!");
        /*
         * Result:
         *
         * Alert:
         * Sending SMS: Security alert!
         * */

        Notification reminder = new ReminderNotification(new SMSChannel());
        reminder.sendNotification("Reminder, drink water!");
        /*
         * Result:
         *
         * Reminder:
         * Sending SMS: Reminder, drink water!
         * */

        reminder.setChannel(new PushNotificationChannel());
        reminder.sendNotification(("Reminder, drink water!"));
        /*
         * Result:
         *
         * Reminder:
         * Sending push notifications: Reminder, drink water!
         * */

        Notification push = new PushNotification(new PushNotificationChannel());
        push.sendNotification("New update available!");
        /*
        * Result:
        *
        * Push notifications:
        * Sending push notifications: New update available!
        * */

        /*--------------------------------------------------------------------*/

        // Creating a list of notifications channels (Implementors)
        List<NotificationChannel> channels = List.of(new EmailChannel(), new SMSChannel(), new PushNotificationChannel());
        // Creating the abstraction with the provided channels
        Notifications alertNotifications = new AlertNotifications(channels);
        // Sending notifications through all channels
        alertNotifications.sendNotifications("Someone in your house!");
        /*
        * Result:
        *
        * Alert notifications:
        * Sending email: Someone in your house!
        * Sending SMS: Someone in your house!
        * Sending push notifications: Someone in your house!
        * */
    }
}
