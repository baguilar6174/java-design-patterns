package behavioral.state;

/**
 * ----------
 * Step 2
 * ----------
 * Represents the vending machine, which changes its behavior based on its current state.
 */
class VendingMachine {
    private State state; // Current state of the vending machine

    /**
     * Constructs a vending machine with an initial state of "WaitingForMoney".
     */
    public VendingMachine() {
        this.state = new WaitingForMoney(this);
    }

    /**
     * Inserts money into the vending machine.
     * Delegates the action to the current state.
     */
    public void insertMoney() {
        this.state.insertMoney();
    }

    /**
     * Selects a product in the vending machine.
     * Delegates the action to the current state.
     */
    public void selectProduct() {
        this.state.selectProduct();
    }

    /**
     * Dispenses the selected product from the vending machine.
     * Delegates the action to the current state.
     */
    public void dispenseProduct() {
        this.state.dispenseProduct();
    }

    /**
     * Changes the current state of the vending machine.
     *
     * @param newState The new state to set
     */
    public void setState(State newState) {
        this.state = newState;
        System.out.println("State changed to: " + newState.getName());
    }

    /**
     * Gets the name of the current state.
     *
     * @return The name of the current state
     */
    public String getStateName() {
        return this.state.getName();
    }
}
