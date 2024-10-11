package Structural_DP.Proxy_DP.Example_1;

public class ATM implements Account {

    @Override
    public void getAccNum() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdraw();
    }

    @Override
    public void withdraw() {

    }

}
