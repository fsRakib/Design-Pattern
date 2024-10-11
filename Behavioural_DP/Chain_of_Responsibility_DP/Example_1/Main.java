package Behavioural_DP.Chain_of_Responsibility_DP.Example_1;

public class Main {
    public static void main(String[] args) {
        PaymentHandler bank = new BankPaymentHandler();
        PaymentHandler creditCard = new CreditCardPaymentHandler();
        PaymentHandler paypal =  new PaypalPaymentHandler();

        bank.setNext(creditCard);
        creditCard.setNext(paypal);

        bank.handlePayment(500);
        bank.handlePayment(10000);
        bank.handlePayment(800);
        bank.handlePayment(100);
    }
}
