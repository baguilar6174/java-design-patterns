package structural.proxy.pattern;

import java.util.List;

/**
 * ----------
 * Step 4
 * ----------
 * Proxy class for controlling access to a document.
 * Implements the Document interface and restricts access based on user roles.
 */
public class DocumentProxy implements Document {

    // The actual document being proxied
    private final Document document;
    // Roles that are allowed to access the document
    private final List<String> mustHaveRoles;

    /**
     * Constructs a DocumentProxy with the specified document and allowed roles.
     *
     * @param document the document to proxy
     * @param mustHaveRoles the list of roles that are allowed to access the document
     */
    public DocumentProxy(Document document, List<String> mustHaveRoles) {
        this.document = document;
        this.mustHaveRoles = mustHaveRoles;
    }

    /**
     * Displays the content of the document to the specified user if they have the required role.
     *
     * @param user the user attempting to view the document
     */
    @Override
    public void displayContent(User user) {
        if (this.mustHaveRoles.contains(user.role())) {
            this.document.displayContent(user);
            return;
        }
        System.out.println("Access denied!");
    }
}
