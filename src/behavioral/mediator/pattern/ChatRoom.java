package behavioral.mediator.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ----------
 * Step 2
 * ----------
 * Represents a chat room that acts as a mediator for communication between users.
 */
public class ChatRoom {
    private final List<User> users; // List of users in the chat room
    public String title; // Title of the chat room

    /**
     * Constructs a new ChatRoom with the specified title.
     *
     * @param title The title of the chat room
     */
    public ChatRoom(String title) {
        this.title = title;
        this.users = new ArrayList<>();
    }

    /**
     * Adds a user to the chat room.
     *
     * @param user The user to add
     */
    public void addUser(User user) {
        this.users.add(user);
    }

    /**
     * Sends a message from a sender to all other users in the chat room.
     * This is the core mediator logic that handles communication between users.
     *
     * @param sender  The user sending the message
     * @param message The message content
     */
    public void sendMessage(User sender, String message) {
        // Filter out the sender to avoid sending the message back to themselves
        List<User> usersToSend = this.users.stream()
                .filter(user -> !user.equals(sender))
                .toList();

        // Relay the message to all other users
        usersToSend.forEach(user -> user.receiveMessage(sender, message));
    }
}
