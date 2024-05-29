package design.patterns.ecommerceplatform;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayPalAdapter implements PaymentAdapter {

    @Override
    public void pay(double amount) {

        log.info("Paid " + amount + " using PayPal.");
    }
}

