package flowercontinue.flowercontinue.payment;

public class PayPalPaymentStrategy implements Payment{
    private String email;

    public PayPalPaymentStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        
    }
}
