package structural.facade.pattern;

/**
 * Represents a Projector in the home theater system.
 * Provides methods to turn the projector on and off.
 */
public class Projector {
    /**
     * Turns on the projector.
     */
    public void turnOn() {
        System.out.println("Projector turn on!");
    }

    /**
     * Turns off the projector.
     */
    public void turnOff() {
        System.out.println("Projector turn off!");
    }
}
