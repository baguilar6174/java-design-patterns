package structural.adapter.task;

public class StripeServiceImpl implements PaymentProcessor {

    private final  StripeService service = new StripeService();

    @Override
    public void processPayment(int amount) {
        this.service.makeCharge(amount);
    }
}
