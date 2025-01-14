package creational.factoryfunction.pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * ----------
 * Step 2
 * ----------
 */
public abstract class Greeter {
    /**
     * Factory function that creates a greeter function for the specified language.
     * The returned function generates a greeting message for a given name.
     *
     * @param lang The language code ("es" for Spanish, "en" for English, "fr" for French).
     * @return A Function that takes a name and returns a greeting message in the specified language.
     */
    public static Function<String, String> createGreeter(Language lang) {
        // Return a function that generates greeting messages
        return name -> {
            Map<Language, String> messages = new HashMap<>();
            messages.put(Language.ES, "Hola, " + name + "!");
            messages.put(Language.EN, "Hello, " + name + "!");
            messages.put(Language.FR, "Bonjour, " + name + "!");
            // Return the greeting message for the specified language or a default message
            return messages.getOrDefault(lang, "Hello, " + name + "!");
        };
    }
}
