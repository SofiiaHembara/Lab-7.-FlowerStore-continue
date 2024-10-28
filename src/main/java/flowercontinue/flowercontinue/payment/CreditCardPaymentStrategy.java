package flowercontinue.flowercontinue.payment;

public class CreditCardPaymentStrategy implements Payment{
    private String cardNumber;

    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        
    }
}
