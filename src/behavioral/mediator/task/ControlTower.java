package behavioral.mediator.task;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the Control Tower, which acts as the mediator for communication between airplanes.
 */
class ControlTower {
    private List<Airplane> airplanes = new ArrayList<>();

    /**
     * Registers an airplane with the control tower.
     *
     * @param airplane The airplane to register
     */
    public void registerAirplane(Airplane airplane) {
        this.airplanes.add(airplane);
    }

    /**
     * Sends a message from one airplane to all other airplanes in the control tower.
     *
     * @param sender  The airplane sending the message
     * @param message The message to send
     */
    public void sendMessage(Airplane sender, String message) {
        this.airplanes.stream()
                .filter(airplane -> airplane != sender) // Exclude the sender
                .forEach(airplane -> airplane.receiveMessage(sender, message));
    }

    /**
     * Handles a landing request from an airplane.
     *
     * @param sender The airplane requesting to land
     */
    public void requestLanding(Airplane sender) {
        System.out.printf("%nControl Tower: Landing permission granted to %s%n", sender.getId());
        sendMessage(sender, sender.getId() + " is landing.");
    }

    /**
     * Handles a takeoff request from an airplane.
     *
     * @param sender The airplane requesting to take off
     */
    public void requestTakeoff(Airplane sender) {
        System.out.printf("%nControl Tower: Takeoff permission granted to %s%n", sender.getId());
        sendMessage(sender, sender.getId() + " is taking off.");
    }
}
