package structural.composite.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ----------
 * Step 3
 * ----------
 * Represents a Folder in the file system.
 * A Folder can contain other FileSystemComponents such as Files or other Folders.
 */
public class Folder implements FileSystemComponent {

    private final String name;
    private final List<FileSystemComponent> contents = new ArrayList<>();

    /**
     * Constructs a Folder with the given name.
     *
     * @param name the name of the folder.
     */
    public Folder(String name) {
        this.name = name;
    }

    /**
     * Adds a FileSystemComponent (File or Folder) to this folder.
     *
     * @param component the component to be added.
     */
    public void add(FileSystemComponent component) {
        this.contents.add(component);
    }

    /**
     * Displays the details of the folder and its contents with the specified indentation.
     *
     * @param indent the indentation string to format the output hierarchy.
     */
    @Override
    public void showDetails(String indent) {
        System.out.printf("%s + Folder: %s%n", indent, this.name);
        this.contents.forEach(content -> content.showDetails(indent + " "));
    }
}
