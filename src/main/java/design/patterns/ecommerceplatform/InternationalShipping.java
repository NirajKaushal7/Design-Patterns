package design.patterns.ecommerceplatform;

public class InternationalShipping implements ShippingMethod {

    @Override
    public double calculate(double weight, double distance) {
        return weight * 2.0 + distance * 0.5;
    }
}

