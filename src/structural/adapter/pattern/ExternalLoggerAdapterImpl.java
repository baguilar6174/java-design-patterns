package structural.adapter.pattern;

/**
 * ----------
 * Step 5
 * ----------
 * The ExternalLoggerAdapterImpl class adapts the ExternalLogger class
 * to conform to the LoggerAdapter interface. This allows the existing
 * ExternalLogger to work with the new LoggerAdapter interface.
 */
public class ExternalLoggerAdapterImpl implements LoggerAdapter {

    public String file;
    // Creates an instance of ExternalLogger to delegate logging tasks.
    public ExternalLogger logger = ExternalLogger.getInstance();

    public ExternalLoggerAdapterImpl(String file) {
        this.file = file;
    }

    /**
     * Adapts the writeLog method to the writeInfo method of LocalLogger.
     *
     * @param message The log message to write.
     */
    @Override
    public void writeLog(String message) {
        this.logger.info("in " + this.file + " - " + message);
    }

    /**
     * Adapts the writeWarning method to the writeWarn method of LocalLogger.
     *
     * @param message The warning message to write.
     */
    @Override
    public void writeWarning(String message) {
        this.logger.warn("in " + this.file + " - " + message);
    }

    /**
     * Adapts the writeError method to the writeError method of LocalLogger.
     *
     * @param message The error message to write.
     */
    @Override
    public void writeError(String message) {
        this.logger.error("in " + this.file + " - " + message);
    }
}
