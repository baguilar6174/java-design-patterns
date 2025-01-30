package behavioral.command.pattern;

/**
 * ----------
 * Step 2
 * ----------
 * Receiver class that represents a Light with basic operations.
 */
public class Light {
    public void turnOn() {
        System.out.println("The light is on");
    }

    public void turnOff() {
        System.out.println("The light is off");
    }
}
