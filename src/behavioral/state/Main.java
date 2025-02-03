package behavioral.state;

/**
 * ----------
 * Step 6
 * ----------
 * Client code to demonstrate the State Pattern.
 */
public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        System.out.println("\n" + vendingMachine.getStateName());
        vendingMachine.insertMoney();
        vendingMachine.selectProduct();
        vendingMachine.dispenseProduct();

        /*
        * Result:
        *
        * Waiting for Money.
        * Money inserted: Now you can select a product.
        * State changed to: Product Selected.
        * State changed to: Dispensing Product.
        * Product dispensed. Changing state to WaitingForMoney.
        * State changed to: Waiting for Money.
        * */
    }
}

