package structural.adapter.pattern;

/**
 * ----------
 * Step 3
 * ----------
 * The LocalLoggerAdapterImpl class adapts the LocalLogger class
 * to conform to the LoggerAdapter interface. This allows the existing
 * LocalLogger to work with the new LoggerAdapter interface.
 */
public class LocalLoggerAdapterImpl implements LoggerAdapter {
    public String file;
    public LocalLogger logger;

    /**
     * Initializes the adapter with the specified file.
     * It creates an instance of LocalLogger to delegate logging tasks.
     *
     * @param file The file name where logs will be written.
     */
    public LocalLoggerAdapterImpl(String file) {
        this.file = file;
        this.logger = new LocalLogger(file);
    }

    /**
     * Adapts the writeLog method to the writeInfo method of LocalLogger.
     *
     * @param message The log message to write.
     */
    @Override
    public void writeLog(String message) {
        this.logger.writeInfo(message);
    }

    /**
     * Adapts the writeError method to the writeError method of LocalLogger.
     *
     * @param message The error message to write.
     */
    @Override
    public void writeError(String message) {
        this.logger.writeError(message);
    }

    /**
     * Adapts the writeWarning method to the writeWarn method of LocalLogger.
     *
     * @param message The warning message to write.
     */
    @Override
    public void writeWarning(String message) {
        this.logger.writeWarn(message);
    }
}
