package design.patterns.ecommerceplatform;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ECommercePlatformMain {
    private ECommercePlatformMain(){}
    public static void main() {

        Product baseProduct = new Product("Laptop", 1000.00);
        log.info("Base Product : " + baseProduct.getName() + "  Price : " + baseProduct.getPrice());


        Product giftWrappedProduct = new GiftWrappedProduct(baseProduct);
        log.info("After Gift Wrapping : " + giftWrappedProduct.getName() + " Price : " + giftWrappedProduct.getPrice());

        Product warrantyProduct = new WarrantyProduct(giftWrappedProduct);
        log.info("After Adding Warranty : " + warrantyProduct.getName() + "  Price : " + warrantyProduct.getPrice());


        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(warrantyProduct);

        ApplyDiscountCommand applyDiscount = new ApplyDiscountCommand(cart, 10.0);
        UpdateQuantityCommand updateQuantity = new UpdateQuantityCommand(cart, warrantyProduct, 2);

        applyDiscount.execute();
        updateQuantity.execute();

        log.info("Cart Total after Discount and Quantity Update : " + cart.getTotal());


        ShippingMethod shippingMethod = new StandardShipping();
        double shippingCost = shippingMethod.calculate(5.0, 10.0);
        log.info("Shipping Cost Standard : " + shippingCost);


        PaymentAdapter paymentAdapter = new PayPalAdapter();
        double totalAmount = cart.getTotal() + shippingCost;
        paymentAdapter.pay(totalAmount);
    }
}
