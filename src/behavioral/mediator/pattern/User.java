package behavioral.mediator.pattern;

import java.util.Objects;

/**
 * ----------
 * Step 1
 * ----------
 * Represents a user in a chat room. Users communicate with each other through the ChatRoom mediator.
 */
public class User {
    private final String username; // Unique identifier for the user
    private final ChatRoom chatRoom; // The mediator that handles communication

    /**
     * Constructs a new User and registers them with the specified ChatRoom.
     *
     * @param username The name of the user
     * @param chatRoom The chat room (mediator) the user belongs to
     */
    public User(String username, ChatRoom chatRoom) {
        this.username = username;
        this.chatRoom = chatRoom;
        this.chatRoom.addUser(this); // Register the user with the chat room
    }

    /**
     * Sends a message to the chat room. The message is relayed to all other users by the mediator.
     *
     * @param message The message to send
     */
    public void sendMessage(String message) {
        System.out.printf("%n%s send: '%s'%n", this.username, message);
        this.chatRoom.sendMessage(this, message); // Delegate message sending to the mediator
    }

    /**
     * Receives a message from another user via the chat room.
     *
     * @param sender  The user who sent the message
     * @param message The message content
     */
    public void receiveMessage(User sender, String message) {
        System.out.printf("%s receive '%s' by %s%n", this.username, message, sender.username);
    }

    /**
     * Checks if two users are equal based on their username and chat room.
     *
     * @param o The object to compare
     * @return true if the users are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(chatRoom, user.chatRoom);
    }

    /**
     * Generates a hash code for the user based on their username and chat room.
     *
     * @return The hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(username, chatRoom);
    }
}
