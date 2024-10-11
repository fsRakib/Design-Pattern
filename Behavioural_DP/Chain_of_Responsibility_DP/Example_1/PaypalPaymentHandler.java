package Behavioural_DP.Chain_of_Responsibility_DP.Example_1;

public class PaypalPaymentHandler extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        if (amount <= 15000) {
            System.out.println("Paid using Paypal amount " + amount);
        } else {
            next.handlePayment(amount);
        }

    }

}
