package Behavioural_DP.Chain_of_Responsibility_DP.Example_1;

public class BankPaymentHandler extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        if (amount <= 500) {
            System.out.println("Paid using Bank amount " + amount);
        } else {
            next.handlePayment(amount);
        }
    }

}
