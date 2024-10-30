package oops.encap.login;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        Login login = new Login("user1","1234");
        Scanner sc = new Scanner(System.in);
        String choice="";
        do {
            System.out.print("Enter 1 to login 2 if you forgot password : ");
            int opt = sc.nextInt();
            if (opt == 1) {
                System.out.print("Enter user name : ");
                String user = sc.next();
                System.out.print("Enter password : ");
                String pass = sc.next();
                login.loginCheck(user, pass);
            } else if (opt == 2) {
                System.out.print("Enter your username : ");
                if (login.getUserName().equals(sc.next())) {
                    System.out.print("Username is correct!! now enter your new password : ");
                    login.setPassword(sc.next());
                } else {
                    System.out.println("Wrong username!!");
                }

            }
            System.out.print("Want to try again? y for yes n for no : ");
            choice=sc.next();
        }while(choice.equalsIgnoreCase("y"));
    }
}
