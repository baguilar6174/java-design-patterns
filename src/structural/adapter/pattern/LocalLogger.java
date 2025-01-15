package structural.adapter.pattern;

/**
 * ----------
 * Step 2
 * ----------
 * The LocalLogger class represents an existing logging implementation
 * that writes logs, warnings, and errors to a specific file.
 */
public class LocalLogger {
    public String file;

    /**
     * Initializes the LocalLogger with the given file name.
     *
     * @param file The file name where logs will be written.
     */
    public LocalLogger(String file) {
        this.file = file;
    }

    /**
     * Writes an informational log message.
     *
     * @param message The log message to write.
     */
    public void writeInfo(String message) {
        System.out.printf("[%s LOG] %s%n", this.file, message);
    }

    /**
     * Writes an error message.
     *
     * @param message The error message to write.
     */
    public void writeError(String message) {
        System.out.printf("[%s ERROR] %s%n", this.file, message);
    }

    /**
     * Writes a warning message.
     *
     * @param message The warning message to write.
     */
    public void writeWarn(String message) {
        System.out.printf("[%s WARNING] %s%n", this.file, message);
    }
}
