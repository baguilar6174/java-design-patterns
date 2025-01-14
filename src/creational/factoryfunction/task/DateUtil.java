package creational.factoryfunction.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class DateUtil {

    /**
     * Formats the given date into the format "yyyy-MM-dd HH:mm:ss".
     *
     * @param date The LocalDateTime object to be formatted.
     * @return A string representation of the date in the format "yyyy-MM-dd HH:mm:ss".
     */
    public static String formatDate(LocalDateTime date) {
        // Define the desired date-time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // Format the given date and return the result
        return date.format(formatter);
    }
}
