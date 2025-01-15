package structural.adapter.pattern;

/**
 * Demonstrates the use of the Adapter Pattern by utilizing
 * the LocalLoggerAdapterImpl to standardize logging operations.
 */
public class Main {

    public static void main(String[] args) {
        LoggerAdapter localLogger = new LocalLoggerAdapterImpl("file-local.txt");

        localLogger.writeLog("Normal log");
        /*
        * Result:
        *
        * [file-local.txt LOG] Normal log
        */

        localLogger.writeWarning("Warning message");
        /*
         * Result:
         *
         * [file-local.txt WARNING] Warning message
         */

        localLogger.writeError("Error message");
        /*
         * Result:
         *
         * [file-local.txt ERROR] Error message
         */

        System.out.println("----------------------------");

        LoggerAdapter externalLogger = new ExternalLoggerAdapterImpl("file-external.txt");

        externalLogger.writeLog("Normal log");
        /*
         * Result:
         *
         * 2025-01-15 12:05:10 [INFO]: in file-external.txt - Normal log
         */

        externalLogger.writeWarning("Warning message");
        /*
         * Result:
         *
         * 2025-01-15 12:05:10 [WARNING]: in file-external.txt - Warning message
         */

        externalLogger.writeError("Error message");
        /*
         * Result:
         *
         * 2025-01-15 12:05:10 [ERROR]: in file-external.txt - Error message
         */
    }
}
