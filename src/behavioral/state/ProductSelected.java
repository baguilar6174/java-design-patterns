package behavioral.state;

/**
 * ----------
 * Step 4
 * ----------
 * Represents the "ProductSelected" state of the vending machine.
 */
class ProductSelected implements State {
    private final VendingMachine vendingMachine; // Reference to the vending machine

    /**
     * Constructs the "ProductSelected" state.
     *
     * @param vendingMachine The vending machine this state belongs to
     */
    public ProductSelected(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public String getName() {
        // Name of the state
        return "Product Selected";
    }

    @Override
    public void insertMoney() {
        System.out.println("Please select a product - money already inserted.");
    }

    @Override
    public void selectProduct() {
        this.vendingMachine.setState(new DispensingProduct(this.vendingMachine)); // Transition to "DispensingProduct" state
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please select a product before dispensing.");
    }
}
