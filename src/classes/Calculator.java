package classes;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        Addition addition = new Addition();
        Subtraction subtraction= new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        Modulus modulus = new Modulus();

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
            int operands = 0;
            int num1;
            int num2;
            int num3;
            int num4;
            switch (input) {
                case 1:
                    System.out.print("How many numbers do you want to add (2, 3 or 4) : ");
                    operands=scanner.nextInt();
                    switch(operands){
                        case 2:
                            System.out.print("Enter the first number : ");
                            num1 = scanner.nextInt();
                            System.out.print("Enter the Second number : ");
                            num2 = scanner.nextInt();
                            System.out.println("Sum is :" + addition.doAddition(num1,num2));
                            break;
                        case 3:
                            System.out.print("Enter the first number : ");
                            num1 = scanner.nextInt();
                            System.out.print("Enter the second number : ");
                            num2 = scanner.nextInt();
                            System.out.print("Enter the third number : ");
                            num3 = scanner.nextInt();
                            System.out.println("Sum is :" + addition.doAddition(num1,num2,num3));
                            break;
                        case 4:
                            System.out.print("Enter the first number : ");
                            num1 = scanner.nextInt();
                            System.out.print("Enter the second number : ");
                            num2 = scanner.nextInt();
                            System.out.print("Enter the third number : ");
                            num3 = scanner.nextInt();
                            System.out.print("Enter the fourth number : ");
                            num4 = scanner.nextInt();
                            System.out.println("Sum is :" + addition.doAddition(num1,num2,num3,num4));
                            break;
                        default:
                            System.out.println("Invalid number of operands");

                    }
                    break;
                case 2:
                    System.out.print("How many numbers do you want to subtract (2, 3 or 4) : ");
                    operands=scanner.nextInt();
                    switch(operands){
                        case 2:
                            System.out.print("Enter the first number : ");
                            num1 = scanner.nextInt();
                            System.out.print("Enter the second number : ");
                            num2 = scanner.nextInt();
                            System.out.println("Difference is :" + (subtraction.doSubtraction(num1,num2)));
                            break;
                        case 3:
                            System.out.print("Enter the first number : ");
                            num1 = scanner.nextInt();
                            System.out.print("Enter the second number : ");
                            num2 = scanner.nextInt();
                            System.out.print("Enter the third number : ");
                            num3 = scanner.nextInt();
                            System.out.println("Difference is :" + (subtraction.doSubtraction(num1,num2,num3)));
                            break;
                        case 4:
                            System.out.print("Enter the first number : ");
                            num1 = scanner.nextInt();
                            System.out.print("Enter the second number : ");
                            num2 = scanner.nextInt();
                            System.out.print("Enter the third number : ");
                            num3 = scanner.nextInt();
                            System.out.print("Enter the fourth number : ");
                            num4 = scanner.nextInt();
                            System.out.println("Difference is :" + (subtraction.doSubtraction(num1,num2,num3,num4)));
                            break;
                        default:
                            System.out.println("Invalid number of operands!!");

                    }
                    break;
                case 3:
                    System.out.print("How many numbers do you want to multiply (2, 3 or 4) : ");
                    operands=scanner.nextInt();
                    switch(operands){
                        case 2:
                            System.out.print("Enter the first number : ");
                            num1 = scanner.nextInt();
                            System.out.print("Enter the second number : ");
                            num2 = scanner.nextInt();
                            System.out.println("Product is :" + (multiplication.doMultiplication(num1,num2)));
                            break;
                        case 3:
                            System.out.print("Enter the first number : ");
                            num1 = scanner.nextInt();
                            System.out.print("Enter the first number : ");
                            num2 = scanner.nextInt();
                            System.out.print("Enter the first number : ");
                            num3 = scanner.nextInt();
                            System.out.println("Product is :" + (multiplication.doMultiplication(num1,num2,num3)));
                            break;
                        case 4:
                            System.out.print("Enter the first number : ");
                            num1 = scanner.nextInt();
                            System.out.print("Enter the second number : ");
                            num2 = scanner.nextInt();
                            System.out.print("Enter the third number : ");
                            num3 = scanner.nextInt();
                            System.out.print("Enter the fourth number : ");
                            num4 = scanner.nextInt();
                            System.out.println("Product is :" + (multiplication.doMultiplication(num1,num2,num3,num4)));
                            break;
                        default:
                            System.out.println("Invalid number of operands!!");

                    }
                    break;
                case 4:
                    System.out.print("Enter the first number : ");
                    int num7 = scanner.nextInt();
                    System.out.print("Enter the first number : ");
                    int num8 = scanner.nextInt();
                    System.out.println("Quotient is :" + (division.doDivision(num7,num8)));
                    break;
                case 5:
                    System.out.print("Enter the first number : ");
                    int num9 = scanner.nextInt();
                    System.out.print("Enter the first number : ");
                    int num10 = scanner.nextInt();
                    System.out.println("Reminder is :" + (modulus.doModulus(num9,num10)));
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
