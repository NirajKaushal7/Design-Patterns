package design.patterns.ecommerceplatform;

public class UpdateQuantityCommand implements CheckoutCommand {
    private ShoppingCart cart;
    private Product product;
    private int quantity;

    public UpdateQuantityCommand(ShoppingCart cart, Product product, int quantity) {
        this.cart = cart;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public void execute() {
        cart.removeProduct(product);
        for (int i = 0; i < quantity; i++) {
            cart.addProduct(product);
        }
    }
}

