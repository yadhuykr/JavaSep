package assignments;
import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float balance =0;
        float deposit=0;
        float withdrawal=0;
        String tries="y";
        String subinp="y";
        int checkpin=0;

        System.out.println("Welcome to the XYZ Banking System! \n" +
                "Set a 4 digit pin to continue!! Note this pin will be used for all transactions except balance check");
        int pin = scanner.nextInt();
        do {
            System.out.println("Please choose an option:\n1 for Check Balance \n2 for Deposit Money " +
                    "\n3 for Withdraw Money \n4 to exit");
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    System.out.println("Your current balance is: "+balance);
                    break;
                case 2:
                    do{
                        System.out.println("Enter the 4 digit pin to continue");
                        checkpin=scanner.nextInt();
                        if(pin==checkpin){
                            System.out.println("You are validated");
                            System.out.print("Enter the amount to deposit: ");
                            deposit = scanner.nextFloat();
                            System.out.println(deposit+" has been deposited to your account");
                            balance = balance + deposit;
                            break;
                        }else {
                            System.out.println("Wrong pin!!! Want to try again? y for yes n for no");
                            subinp = scanner.next();
                        }
                    }while(subinp.equalsIgnoreCase("y"));
                    break;
                case 3:
                    do {
                        System.out.println("Enter the 4 digit pin to continue");
                        checkpin = scanner.nextInt();
                        if (pin == checkpin) {
                            System.out.println("You are validated");
                            System.out.print("Enter the amount to withdraw: ");
                            withdrawal = scanner.nextFloat();
                            if (balance < withdrawal) {
                                System.out.println("Insufficient balance!! Please check you current balance");
                            } else {
                                System.out.println(withdrawal + " is withdrawn!!");
                                balance = balance - withdrawal;
                            }
                            break;
                        } else {
                            System.out.println("Wrong pin!!! Want to try again? y for yes n for no");
                            subinp = scanner.next();
                        }
                    }while(subinp.equalsIgnoreCase("y"));
                    break;
                case 4:
                    System.out.println("Exiting!!! Thank you for using XYZ bank");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option!!! try again");
            }
            System.out.println("Do you want to continue? Press y for yes n for no");
            tries=scanner.next();
        }while(tries.equalsIgnoreCase("y"));
    }
}
