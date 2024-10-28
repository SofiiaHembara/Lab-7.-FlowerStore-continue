package flowercontinue.flowercontinue.controllers;

import flowercontinue.flowercontinue.payment.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @PostMapping("/pay")
    public String pay(@RequestParam String method, @RequestParam double amount) {
        Payment payment;
        if ("creditcard".equalsIgnoreCase(method)) {
            payment = new CreditCardPaymentStrategy("1234-5678-9012-3456");
        } else if ("paypal".equalsIgnoreCase(method)) {
            payment = new PayPalPaymentStrategy("email@example.com");
        } else {
            return "Invalid payment method";
        }
        payment.pay(amount);
        return "Payment of " + amount + " was successful using " + method;
    }
}