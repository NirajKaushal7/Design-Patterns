package design.patterns.assignment2.additional;

public class PaymentContext {

    private PaymentProcessor paymentProcessor;

    public PaymentContext(){
        this.paymentProcessor = new SimplePaymentProcessor();
    }

    public PaymentContext(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public void processPayment(double amount){
        paymentProcessor.processPayment(amount);
    }

    public PaymentProcessor getPaymentProcessor() {
        return paymentProcessor;
    }
    public PaymentProcessor getPaymentProcessor(String type){
        switch (type){
            case "Paytm" : return new Paytm();
            case "PhonePay" : return new PhonePay();
            case "Simple" :
            default: return new SimplePaymentProcessor();
        }
    }
    public void setPaymentProcessor(String type) {
        this.paymentProcessor = getPaymentProcessor(type);
    }
}
