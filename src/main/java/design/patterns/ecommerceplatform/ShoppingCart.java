package design.patterns.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();
    private double discount = 0.0;

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double getTotal() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        total -= total * (discount / 100);
        return total;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}

