package oops.encap.account;

import java.util.Scanner;

public class SetAccountMain {
    public static void main(String[] args) {
        SetAccount setAccount=new SetAccount();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account no : ");
        setAccount.setAccountNo(sc.nextInt());
        System.out.print("Enter first name : ");
        setAccount.setFirstName(sc.next());
        System.out.println("Details saved!!");
    }
}
