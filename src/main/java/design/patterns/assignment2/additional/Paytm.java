package design.patterns.assignment2.additional;

public class Paytm implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Using Paytm processing payment of $" + amount);
    }
}
