package structural.proxy.pattern;

/**
 * ----------
 * Step 2
 * ----------
 * Interface for documents that can display their content to users.
 */
public interface Document {

    /**
     * Displays the content of the document to the specified user.
     *
     * @param user the user attempting to view the document
     */
    void displayContent(User user);
}
