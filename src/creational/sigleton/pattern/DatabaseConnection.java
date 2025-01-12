package creational.sigleton.pattern;

/**
 * ----------
 * Step 1
 * ----------
 * Represents a singleton implementation of a database connection.
 * The Singleton pattern ensures that there is only one instance of
 * the `DatabaseConnection` class in the application. It provides a
 * global point of access to the instance.
 */
public class DatabaseConnection {

    // Static field to hold the single instance of the class
    private static DatabaseConnection instance;
    // Tracks whether the connection is active or not
    private boolean connected = false;

    /**
     * Private constructor to prevent instantiation from outside.
     * This ensures that the class cannot be instantiated using `new`.
     */
    private DatabaseConnection() {}

    /**
     * Returns the single instance of the `DatabaseConnection` class.
     * If the instance doesn't already exist, it creates one.
     *
     * @return The singleton instance of `DatabaseConnection`.
     */
    public static DatabaseConnection getInstance() {
        if (DatabaseConnection.instance == null) {
            DatabaseConnection.instance = new DatabaseConnection();
            System.out.println("Created database connection instance!");
        }
        return DatabaseConnection.instance;
    }

    /**
     * Connects to the database. If the connection is already active, it informs the user.
     */
    public void connect() {
        if(!this.connected) {
            this.connected = true;
            System.out.println("Connection success!");
            return;
        }
        System.out.println("Already connected!");
    }

    /**
     * Disconnects from the database. If there is no active connection, it informs the user.
     */
    public void disconnect() {
        if(this.connected) {
            this.connected = false;
            System.out.println("Disconnection success!");
            return;
        }
        System.out.println("There is no active connection!");
    }
}
