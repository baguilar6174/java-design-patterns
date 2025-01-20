package structural.composite.pattern;

/**
 * ----------
 * Step 1
 * ----------
 * Represents a component in the file system. Can be either a File or a Folder.
 * This is the base interface for implementing the Composite Pattern.
 */
public interface FileSystemComponent {

    /**
     * Displays the details of the component with a given indentation level.
     *
     * @param indent the indentation string to format the output hierarchy.
     */
    void showDetails(String indent);
}
