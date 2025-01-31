package behavioral.mediator.task;

/**
 * Represents an airplane that communicates with other airplanes through the Control Tower.
 */
class Airplane {
    private final String id;
    private final ControlTower controlTower;

    /**
     * Constructs an airplane and registers it with the control tower.
     *
     * @param id           The unique identifier of the airplane
     * @param controlTower The control tower (mediator) to register with
     */
    public Airplane(String id, ControlTower controlTower) {
        this.id = id;
        this.controlTower = controlTower;
        controlTower.registerAirplane(this); // Register with the control tower
    }

    /**
     * Gets the unique identifier of the airplane.
     *
     * @return The airplane's ID
     */
    public String getId() {
        return id;
    }

    /**
     * Requests permission to land from the control tower.
     */
    public void requestLanding() {
        System.out.println(id + " requests permission to land.");
        controlTower.requestLanding(this);
    }

    /**
     * Requests permission to take off from the control tower.
     */
    public void requestTakeoff() {
        System.out.println(id + " requests permission to take off.");
        controlTower.requestTakeoff(this);
    }

    /**
     * Receives a message from another airplane via the control tower.
     *
     * @param sender  The airplane sending the message
     * @param message The message content
     */
    public void receiveMessage(Airplane sender, String message) {
        System.out.println(id + " receives message from " + sender.getId() + ": \"" + message + "\"");
    }
}