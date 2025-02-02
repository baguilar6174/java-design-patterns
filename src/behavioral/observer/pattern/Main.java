package behavioral.observer.pattern;

/**
 * ----------
 * Step 4
 * ----------
 * Client code to demonstrate the Observer Pattern.
 */
public class Main {
    public static void main(String[] args) {
        // Create a YouTube channel
        YoutubeChannel channel = new YoutubeChannel("Develop with Bryan");

        // Create subscribers
        Subscriber subscriber1 = new Subscriber("user1");
        Subscriber subscriber2 = new Subscriber("user2");
        Subscriber subscriber3 = new Subscriber("user3");

        // Subscribe subscribers to the channel
        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);

        // Upload a video and notify subscribers
        channel.uploadVideo("Design Patterns");

        // Subscribe another subscriber
        channel.subscribe(subscriber3);

        // Upload another video and notify subscribers
        channel.uploadVideo("React hooks");

        // Unsubscribe a subscriber
        channel.unsubscribe(subscriber2);

        // Upload another video and notify remaining subscribers
        channel.uploadVideo("Flutter");

        /*
        * Result:
        *
        * New subscription at 'Develop with Bryan' channel!
        * New subscription at 'Develop with Bryan' channel!
        *
        * Channel 'Develop with Bryan' has uploaded a new video 'Design Patterns'!
        *
        * user1 has been notified: New video Design Patterns
        * user2 has been notified: New video Design Patterns
        *
        * New subscription at 'Develop with Bryan' channel!
        *
        * Channel 'Develop with Bryan' has uploaded a new video 'React hooks'!
        *
        * user1 has been notified: New video React hooks
        * user2 has been notified: New video React hooks
        * user3 has been notified: New video React hooks
        *
        * Remove subscription at Develop with Bryan channel!
        *
        * Channel 'Develop with Bryan' has uploaded a new video 'Flutter'!
        *
        * user1 has been notified: New video Flutter
        * user3 has been notified: New video Flutter
        * */
    }
}
