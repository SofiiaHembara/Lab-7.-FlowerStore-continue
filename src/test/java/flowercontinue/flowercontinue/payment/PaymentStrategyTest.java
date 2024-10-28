package flowercontinue.flowercontinue.payment;

import org.junit.jupiter.api.Test;

class PaymentStrategyTest {
     @Test
    void testCreditCardPayment() {
        Payment payment = new CreditCardPaymentStrategy("1234-5678-9012-3456");
        payment.pay(100.0);
    }

    @Test
    void testPayPalPayment() {
        Payment payment = new PayPalPaymentStrategy("email@example.com");
        payment.pay(200.0);
    }
}
