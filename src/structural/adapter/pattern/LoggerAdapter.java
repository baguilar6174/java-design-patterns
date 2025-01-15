package structural.adapter.pattern;

/**
 * ----------
 * Step 1
 * ----------
 * The LoggerAdapter interface defines a standard logging contract
 * with methods to write logs, warnings, and errors.
 */
public interface LoggerAdapter {

    /**
     * Writes a normal log message.
     *
     * @param message The log message to write.
     */
    void writeLog(String message);

    /**
     * Writes a warning message.
     *
     * @param message The warning message to write.
     */
    void writeWarning(String message);

    /**
     * Writes an error message.
     *
     * @param message The error message to write.
     */
    void writeError(String message);
}
