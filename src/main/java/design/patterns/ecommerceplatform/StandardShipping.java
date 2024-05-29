package design.patterns.ecommerceplatform;

public class StandardShipping implements ShippingMethod {

    @Override
    public double calculate(double weight, double distance) {
        return weight * 0.5 + distance * 0.1;
    }
}

