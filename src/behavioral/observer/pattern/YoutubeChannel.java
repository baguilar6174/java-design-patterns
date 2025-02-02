package behavioral.observer.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ----------
 * Step 2
 * ----------
 * Represents a YouTube channel that notifies its subscribers when a new video is uploaded.
 */
public class YoutubeChannel {
    private final List<Observer> subscribers; // List of subscribers (observers)
    private final String name; // Name of the YouTube channel

    /**
     * Constructs a YouTube channel with the specified name.
     *
     * @param name The name of the channel
     */
    public YoutubeChannel(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    /**
     * Subscribes an observer to the channel.
     *
     * @param observer The observer to subscribe
     */
    public void subscribe(Observer observer) {
        this.subscribers.add(observer);
        System.out.printf("New subscription at '%s' channel!%n", this.name);
    }

    /**
     * Unsubscribes an observer from the channel.
     *
     * @param observer The observer to unsubscribe
     */
    public void unsubscribe(Observer observer) {
        this.subscribers.remove(observer);
        System.out.printf("Remove subscription at %s channel!%n", this.name);
    }

    /**
     * Uploads a new video and notifies all subscribers.
     *
     * @param title The title of the new video
     */
    public void uploadVideo(String title) {
        System.out.printf("%nChannel '%s' has uploaded a new video '%s'!%n%n", this.name, title);
        this.subscribers.forEach(s -> s.notify(title)); // Notify all subscribers
    }
}
