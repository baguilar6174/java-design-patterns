package structural.adapter.task;

public class Main {
    public static void main(String[] args) {
        int paymentAmount = 100;
        PaymentProcessor paypal = new PaypalServiceImpl();
        PaymentProcessor stripe = new StripeServiceImpl();
        PaymentProcessor googlePay = new GooglePayServiceImpl();
        paypal.processPayment(paymentAmount);
        stripe.processPayment(paymentAmount);
        googlePay.processPayment(paymentAmount);

    }
}
