package creational.prototype.pattern;

/**
 * ----------
 * Step 1
 * ----------
 * Represents a Document with a title, content, and author.
 * Demonstrates the Prototype Design Pattern, allowing objects to be cloned.
 */
public class Document {

    /**
     * The title of the document.
     */
    public String title;

    /**
     * The content of the document (private to ensure encapsulation).
     */
    private String content;

    /**
     * The author of the document.
     */
    public String author;

    /**
     * Constructs a new Document with the specified title, content, and author.
     *
     * @param title   the title of the document.
     * @param content the content of the document.
     * @param author  the author of the document.
     */
    public Document(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    /**
     * Displays the information of the document (title, content, and author).
     */
    public void displayInfo() {
        System.out.printf("Title: %s, Content: %s, Author: %s%n", this.title, this.content, this.author);
    }

    /**
     * Creates a clone (copy) of the current Document instance.
     * This demonstrates the Prototype Design Pattern, which allows for object duplication
     * without directly instantiating a new object using a constructor.
     *
     * @return a new Document instance with the same title, content, and author as the current instance.
     */
    public Document cloneDocument() {
        return new Document(this.title, this.content, this.author);
    }
}
