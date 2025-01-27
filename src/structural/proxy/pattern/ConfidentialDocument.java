package structural.proxy.pattern;

/**
 * ----------
 * Step 3
 * ----------
 * Represents a confidential document with restricted access.
 * Implements the Document interface to provide controlled content display.
 */
public class ConfidentialDocument implements Document {

    // The content of the confidential document
    private final String content;

    /**
     * Constructs a ConfidentialDocument with the specified content.
     *
     * @param content the content of the document
     */
    public ConfidentialDocument(String content) {
        this.content = content;
    }

    /**
     * Displays the content of the document to the specified user.
     *
     * @param user the user attempting to view the document
     */
    @Override
    public void displayContent(User user) {
        System.out.printf("User: %s with Role: %s, Document content: %s%n", user.name(), user.role(), this.content);
    }
}
