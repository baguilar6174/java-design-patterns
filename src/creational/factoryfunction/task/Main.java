package creational.factoryfunction.task;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<String, String> infoLogger = Logger.createLogger(LogLevel.INFO);
        System.out.println(infoLogger.apply("Run app!"));

        Function<String, String> warningLogger = Logger.createLogger(LogLevel.WARNING);
        System.out.println(warningLogger.apply("A problem with the memory was detected!"));

        Function<String, String> errorLogger = Logger.createLogger(LogLevel.ERROR);
        System.out.println(errorLogger.apply("An unknown error occurs!"));
    }
}
