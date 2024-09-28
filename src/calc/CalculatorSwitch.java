package calc;

import java.util.Scanner;
import java.util.SortedMap;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
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

            switch (input) {
                case 1:
                    System.out.print("Enter the first number : ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter the first number : ");
                    int num2 = scanner.nextInt();
                    System.out.println("Sum is :" + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Enter the first number : ");
                    int num3 = scanner.nextInt();
                    System.out.print("Enter the first number : ");
                    int num4 = scanner.nextInt();
                    System.out.println("Difference is :" + (num3 - num4));
                    break;
                case 3:
                    System.out.print("Enter the first number : ");
                    int num5 = scanner.nextInt();
                    System.out.print("Enter the first number : ");
                    int num6 = scanner.nextInt();
                    System.out.println("Product is :" + (num5 * num6));
                    break;
                case 4:
                    System.out.print("Enter the first number : ");
                    int num7 = scanner.nextInt();
                    System.out.print("Enter the first number : ");
                    int num8 = scanner.nextInt();
                    System.out.println("Quotient is :" + (num7 / num8));
                    break;
                case 5:
                    System.out.print("Enter the first number : ");
                    int num9 = scanner.nextInt();
                    System.out.print("Enter the first number : ");
                    int num10 = scanner.nextInt();
                    System.out.println("Reminder is :" + (num9 % num10));
                    break;
                case 0:
                    System.out.print("Exiting!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option!!!!");
                    break;
            }
            System.out.println("Do you wish to conitnue???");
            System.out.println("If yes enter y or no enter n");
            choice= scanner.next();

        }while(choice.equalsIgnoreCase("y"));
    }
}
