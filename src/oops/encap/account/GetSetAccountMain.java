package oops.encap.account;

import java.util.Scanner;

public class GetSetAccountMain {
    public static void main(String[] args) {
        GetSetAccount getSetAccount=new GetSetAccount();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the account number : ");
        getSetAccount.setAccoutNo(sc.nextInt());
        System.out.print("Enter the first name : ");
        getSetAccount.setFirstName(sc.next());

        System.out.println("Accoutn info set!!");
        System.out.println("Account number : "+getSetAccount.getAccoutNo());
        System.out.print("First Name : "+getSetAccount.getFirstName());

    }
}
