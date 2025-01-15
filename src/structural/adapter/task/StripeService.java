package structural.adapter.task;

public class StripeService {

    public void makeCharge(int amount) {
        System.out.printf("Payment processing with Stripe %s%n", amount);
    }
}
