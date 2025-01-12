package creational.sigleton.pattern;

/**
 * ----------
 * Step 2
 * ----------
 * Demonstrates the usage of the Singleton Pattern with a database connection example.
 */
public class Main {
    public static void main(String[] args) {

        // Retrieve the singleton instance and establish a connection
        DatabaseConnection firstDatabaseConnection = DatabaseConnection.getInstance();
        /*
        * Result:
        *
        * Created database connection instance!
        * */

        firstDatabaseConnection.connect();
        /*
         * Result:
         *
         * Connection success!
         * */

        // Retrieve the same instance and attempt another connection
        DatabaseConnection secondDatabaseConnection = DatabaseConnection.getInstance();
        secondDatabaseConnection.connect();
        /*
         * Result:
         *
         * Already connected!
         * */

        // Verify that both references point to the same instance
        System.out.printf("Are equals?: %b%n", firstDatabaseConnection == secondDatabaseConnection);
        /*
         * Result:
         *
         * Are equals?: true
         * */

        // Disconnect the connection using both references
        firstDatabaseConnection.disconnect();
        /*
         * Result:
         *
         * Disconnection success!
         * */

        secondDatabaseConnection.disconnect();
        /*
         * Result:
         *
         * There is no active connection!
         * */

        // Attempt to reconnect
        secondDatabaseConnection.connect();
        /*
         * Result:
         *
         * Connection success!
         * */
    }
}
