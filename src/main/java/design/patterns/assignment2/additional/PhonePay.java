package design.patterns.assignment2.additional;

public class PhonePay implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Using PhonePay processing payment of $" + amount);
    }
}
