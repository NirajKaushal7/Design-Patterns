package design.patterns.assignment2.additional;

public class SimplePaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Simple processing payment of $" + amount);
    }
}
