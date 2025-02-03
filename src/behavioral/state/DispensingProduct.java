package behavioral.state;

/**
 * ----------
 * Step 5
 * ----------
 * Represents the "DispensingProduct" state of the vending machine.
 */
class DispensingProduct implements State {
    private final VendingMachine vendingMachine; // Reference to the vending machine

    /**
     * Constructs the "DispensingProduct" state.
     *
     * @param vendingMachine The vending machine this state belongs to
     */
    public DispensingProduct(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public String getName() {
        // Name of the state
        return "Dispensing Product";
    }

    @Override
    public void insertMoney() {
        System.out.println("Please wait for the product to be dispensed.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Product already selected and dispensing.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Product dispensed. Changing state to WaitingForMoney.");
        this.vendingMachine.setState(new WaitingForMoney(this.vendingMachine)); // Transition back to "WaitingForMoney" state
    }
}
