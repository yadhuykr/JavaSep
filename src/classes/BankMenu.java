package classes;

import java.util.Scanner;

public class BankMenu {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.accountId="st111";
        bank.balance=2300;
        bank.firstName="XYZ";
        bank.lastName="Abc";
        bank.accountNumber=11111111;

        Scanner scanner = new Scanner(System.in);
        float amount=0;
        String tries="y";
        System.out.println("Menu");
    do {
        System.out.print("Press \n1 for withdrawal \n2 for deposit \n3 for balance check\n");
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.print("Enter the amount to withdraw: ");
            amount = scanner.nextFloat();
            bank.withdrawal(amount);
        } else if (input == 2) {
            System.out.print("Enter the amount to deposit: ");
            amount = scanner.nextFloat();
            bank.newDeposit(amount);
        } else if (input == 3) {
            bank.getBalance();
        } else {
            System.out.println("Invalid input");
        }
        System.out.println("Do you want to continue? Press y for yes n for no");
        tries=scanner.next();
    }while(tries.equalsIgnoreCase("y"));
    }
}
