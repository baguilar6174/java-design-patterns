package creational.factoryfunction.task;

import java.time.LocalDateTime;
import java.util.function.Function;

public class Logger {
    public static Function<String, String> createLogger(LogLevel level) {
        return message -> {
            LocalDateTime now = LocalDateTime.now();
            return "[" + level.name() + ":" + DateUtil.formatDate(now) +"] "+ message;
        };
    }
}
