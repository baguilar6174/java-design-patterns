package structural.adapter.pattern;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * ----------
 * Step 4
 * ----------
 * The ExternalLogger class simulates a external library for a logging implementation
 * that writes logs, warnings, and errors to a specific file.
 */
public class ExternalLogger {

    private static ExternalLogger instance;
    private final DateTimeFormatter dateFormatter;

    private ExternalLogger() {
        dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    // Apply Singleton Pattern
    public static ExternalLogger getInstance() {
        if (instance == null) {
            instance = new ExternalLogger();
        }
        return instance;
    }

    /**
     * Writes an informational log message.
     *
     * @param message The log message to write.
     */
    public void info(String message) {
        log("INFO", message);
    }

    /**
     * Writes a warning message.
     *
     * @param message The warning message to write.
     */
    public void warn(String message) {
        log("WARNING", message);
    }

    /**
     * Writes an error message.
     *
     * @param message The error message to write.
     */
    public void error(String message) {
        log("ERROR", message);
    }

    /**
     * This method generates a timestamp for the log entry, formats the log message
     * to include the timestamp, log level, and the provided message, and then prints
     * the log message to the standard output.
     *
     * @param level   The severity level of the log (e.g., "INFO", "ERROR", "WARN").
     * @param message The content of the log message to be recorded.
     */
    private void log(String level, String message) {
        String timestamp = LocalDateTime.now().format(dateFormatter);
        String logMessage = String.format("%s [%s]: %s", timestamp, level, message);
        System.out.println(logMessage);
    }
}
