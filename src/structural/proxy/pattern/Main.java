package structural.proxy.pattern;

import java.util.List;

/**
 * ----------
 * Step 5
 * ----------
 * Demonstrates the Proxy pattern with a confidential document and role-based access control.
 */
public class Main {
    public static void main(String[] args) {
        // Create a confidential document
        ConfidentialDocument document = new ConfidentialDocument("Confidential content");

        // Create a proxy for the document with allowed roles
        DocumentProxy proxy = new DocumentProxy(document, List.of("admin"));

        // Create users with different roles
        User user1 = new User("Bryan", "dev");
        User user2 = new User("Alexander", "admin");

        // Attempt to display the document content
        proxy.displayContent(user1);

        /*
        * Result:
        *
        * Access denied!
        * */

        // Attempt to display the document content
        proxy.displayContent(user2);

        /*
         * Result:
         *
         * User: Alexander with Role: admin, Document content: Confidential content
         * */
    }
}
