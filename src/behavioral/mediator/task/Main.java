package behavioral.mediator.task;

/**
 * Client code to test the Mediator Pattern implementation.
 */
public class Main {
    public static void main(String[] args) {
        ControlTower controlTower = new ControlTower();

        Airplane airplane1 = new Airplane("Flight 101", controlTower);
        Airplane airplane2 = new Airplane("Flight 202", controlTower);
        Airplane airplane3 = new Airplane("Flight 303", controlTower);

        // Example interactions
        airplane1.requestLanding();
        airplane2.requestTakeoff();
        airplane3.requestLanding();
    }
}
