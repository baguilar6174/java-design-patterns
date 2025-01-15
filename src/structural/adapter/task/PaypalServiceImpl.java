package structural.adapter.task;

public class PaypalServiceImpl implements PaymentProcessor {

    private final PaypalService service = new PaypalService();

    @Override
    public void processPayment(int amount) {
        this.service.sendPayment(amount);
    }
}
