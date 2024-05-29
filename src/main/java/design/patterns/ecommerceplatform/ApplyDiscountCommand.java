package design.patterns.ecommerceplatform;

public class ApplyDiscountCommand implements CheckoutCommand {
    private ShoppingCart cart;
    private double discount;

    public ApplyDiscountCommand(ShoppingCart cart, double discount) {
        this.cart = cart;
        this.discount = discount;
    }

    @Override
    public void execute() {
        cart.setDiscount(discount);
    }
}
