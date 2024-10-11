package Behavioural_DP.Chain_of_Responsibility_DP.Example_1;

public abstract class PaymentHandler {
    protected PaymentHandler next;

    public void setNext(PaymentHandler next) {
        this.next = next;
    }

    public abstract void handlePayment(double amount);
}
