package calc;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************");
        System.out.println("    Calculator     ");
        System.out.println("*******************");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        System.out.println("0.Exit");
        System.out.print("Enter your choice: ");
        int input = scanner.nextInt();
        if (input==0) {
            System.out.println("Existing");
            System.exit(0);

        }
        System.out.print("Enter the first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the first number : ");
        int num2 = scanner.nextInt();

        if (input==1){
            System.out.println("Sum is :"+(num1+num2));
        } else if (input==2){
            System.out.println("Difference is :" + (num1-num2));
        } else if (input==2){
            System.out.println("Difference is :"+(num1-num2));
        } else if (input==3){
            System.out.println("Product is :"+(num1*num2));
        } else if (input==4){
            System.out.println("Quotient is :"+(num1/num2));
        } else if (input==5) {
            System.out.println("Reminder is :" + (num1 % num2));
        }else{
            System.out.println("Invalid option");
        }
    }
}

