package behavioral.command.pattern;

/**
 * ----------
 * Step 5
 * ----------
 * Receiver class that represents a Fan with basic operations.
 */
public class Fan {
    public void on() {
        System.out.println("Fan is on");
    }

    public void off() {
        System.out.println("The fan is off");
    }
}
