package design.patterns.ecommerceplatform;

public class WarrantyProduct extends ProductDecorator {

    public WarrantyProduct(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public String getName() {
        return decoratedProduct.getName() + " (Extended Warranty)";
    }

    @Override
    public double getPrice() {
        return decoratedProduct.getPrice() + 20.00;
    }
}
