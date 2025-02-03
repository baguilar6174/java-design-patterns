package behavioral.state;

/**
 * ----------
 * Step 3
 * ----------
 * Represents the "WaitingForMoney" state of the vending machine.
 */
class WaitingForMoney implements State {
    private final VendingMachine vendingMachine; // Reference to the vending machine

    /**
     * Constructs the "WaitingForMoney" state.
     *
     * @param vendingMachine The vending machine this state belongs to
     */
    public WaitingForMoney(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public String getName() {
        // Name of the state
        return "Waiting for Money";
    }

    @Override
    public void insertMoney() {
        System.out.println("Money inserted: Now you can select a product.");
        this.vendingMachine.setState(new ProductSelected(this.vendingMachine)); // Transition to "ProductSelected" state
    }

    @Override
    public void selectProduct() {
        System.out.println("Please insert money first.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please insert money first.");
    }
}
