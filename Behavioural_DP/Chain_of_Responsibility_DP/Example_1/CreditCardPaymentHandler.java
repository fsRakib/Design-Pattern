package Behavioural_DP.Chain_of_Responsibility_DP.Example_1;

public class CreditCardPaymentHandler extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        if (amount <= 1000) {
            System.out.println("Paid using Credit Card amount " + amount);
        } else {
            next.handlePayment(amount);
        }

    }

}
