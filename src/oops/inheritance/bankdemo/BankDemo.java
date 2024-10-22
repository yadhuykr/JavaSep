package oops.inheritance.bankdemo;

public class BankDemo {
    public static void main(String[] args) {

        RBCBank rbcBank=new RBCBank();
        ScotiaBank scotiaBank=new ScotiaBank();
        BMOBank bmoBank=new BMOBank();
        PragraBank pragraBank=new PragraBank();

        System.out.println("----RBC----");
        rbcBank.interestRate();
        System.out.println("----Scotia----");
        scotiaBank.interestRate();
        System.out.println("----BMO----");
        bmoBank.interestRate();
        System.out.println("----Pragra----");
        pragraBank.interestRate();
    }




}
