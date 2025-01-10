package creational.prototype.pattern;

/**
 * ----------
 * Step 2
 * ----------
 * Demonstrates the usage of the Prototype Design Pattern with the Document class.
 */
public class Main {
    public static void main(String[] args) {
        // Create an initial document instance
        Document document = new Document("Document Title", "Document Content", "Bryan");
        // Display the original document's information
        document.displayInfo();

        /*
        * Result
        *
        * Title: Document Title, Content: Document Content, Author: Bryan
        * */

        // Clone the original document to create a new instance
        Document newDocument = document.cloneDocument();
        // Modify the cloned document's title
        newDocument.title = "New Title";
        // Display the modified cloned document's information
        newDocument.displayInfo();

        /*
         * Result
         *
         * Title: New Title, Content: Document Content, Author: Bryan
         * */
    }
}
