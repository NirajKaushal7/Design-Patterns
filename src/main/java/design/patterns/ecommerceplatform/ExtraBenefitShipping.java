package design.patterns.ecommerceplatform;

public class ExtraBenefitShipping implements ShippingMethod {

    @Override
    public double calculate(double weight, double distance) {
        return weight * 1.0 + distance * 0.2;
    }
}
