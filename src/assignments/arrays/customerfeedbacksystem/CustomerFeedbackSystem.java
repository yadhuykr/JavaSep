package assignments.arrays.customerfeedbacksystem;

import java.util.Scanner;

public class CustomerFeedbackSystem {
    public static void main(String[] args) {
        Reviews reviews=new Reviews();

        Scanner sc = new Scanner(System.in);
        String input=" ";
        System.out.println("Welcome to Customer feedback system  \nEnter your reviewss:");
        for(int i=0;i<5;i++){
            System.out.print("Enter review "+(i+1)+": ");
            reviews.reviews[i]=sc.nextLine();
        }
        do{
            System.out.print("Select 1 to display,  2 for search , 3 for exit : ");
            int option=sc.nextInt();
            sc.nextLine();
            switch(option){
                case 1:
                    reviews.display();
                    break;
                case 2:
                    System.out.print("Enter the search phrase: ");
                    String phrase=sc.nextLine();
                    reviews.search(phrase);
                    break;
                case 3:
                    System.out.println("Thank you for using customer feedback system");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
            System.out.print("Do you want to continue: yes or no ");
            input=sc.next();
        }while(input.equalsIgnoreCase("yes"));


    }
}
