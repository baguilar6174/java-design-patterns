package structural.composite.pattern;

/**
 * ----------
 * Step 2
 * ----------
 * Represents a File in the file system.
 * Implements the FileSystemComponent interface.
 */
public class File implements FileSystemComponent {

    private final String name;

    /**
     * Constructs a File with the given name.
     *
     * @param name the name of the file.
     */
    public File(String name) {
        this.name = name;
    }

    /**
     * Displays the details of the file with the specified indentation.
     *
     * @param indent the indentation string to format the output hierarchy.
     */
    @Override
    public void showDetails(String indent) {
        System.out.printf("%s - File: %s%n", indent, this.name);
    }
}
