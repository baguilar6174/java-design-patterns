package structural.adapter.task;

public class PaypalService {

    public void sendPayment(int amount) {
        System.out.printf("Payment processing with Paypal %s%n", amount);
    }
}
