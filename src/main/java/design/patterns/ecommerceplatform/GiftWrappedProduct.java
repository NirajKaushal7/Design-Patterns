package design.patterns.ecommerceplatform;

public class GiftWrappedProduct extends ProductDecorator {

    public GiftWrappedProduct(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public String getName() {
        return decoratedProduct.getName() + " (Gift Wrapped)";
    }

    @Override
    public double getPrice() {
        return decoratedProduct.getPrice() + 5.00;
    }
}
