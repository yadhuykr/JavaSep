package oops.inheritance.bankdemo;

public class BMOBank extends BankOfCanada {

    @Override
    public void interestRate() {
        System.out.println("Interest rate is 2.10%");
    }
}

