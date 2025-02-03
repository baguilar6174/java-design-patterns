package behavioral.state;

/**----------
 * Step 1
 * ----------
 * Represents the state interface for the vending machine.
 * Each state defines the behavior for inserting money, selecting a product, and dispensing the product.
 */
interface State {
    String getName();

    void insertMoney();

    void selectProduct();

    void dispenseProduct();
}
