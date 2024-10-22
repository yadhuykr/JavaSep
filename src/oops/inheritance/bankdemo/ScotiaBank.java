package oops.inheritance.bankdemo;

public class ScotiaBank extends BankOfCanada {

    @Override
    public void interestRate() {
        System.out.println("Interest rate is 1.55%");
    }
}

