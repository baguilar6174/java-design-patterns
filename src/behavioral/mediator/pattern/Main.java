package behavioral.mediator.pattern;

/**
 * ----------
 * Step 3
 * ----------
 * Mediator pattern implementation.
 */
public class Main {
    public static void main(String[] args) {

        // Create a chat room (mediator)
        ChatRoom chatRoom = new ChatRoom("Friends");

        // Create users and register them with the chat room
        User bryan = new User("Bryan", chatRoom);
        User alexander = new User("Alexander", chatRoom);
        User john = new User("John", chatRoom);

        // Users send messages through the chat room
        bryan.sendMessage("Hello!");
        alexander.sendMessage("Hi Bryan");

        /*
        * Result:
        *
        * Bryan send: 'Hello!'
        * Alexander receive 'Hello!' by Bryan
        * John receive 'Hello!' by Bryan
        *
        * Alexander send: 'Hi Bryan'
        * Bryan receive 'Hi Bryan' by Alexander
        * John receive 'Hi Bryan' by Alexander
        * */
    }
}
