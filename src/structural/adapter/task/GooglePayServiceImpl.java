package structural.adapter.task;

public class GooglePayServiceImpl implements PaymentProcessor {

    private final GooglePayService service = new GooglePayService();

    @Override
    public void processPayment(int amount) {
        this.service.pay(amount);
    }
}
