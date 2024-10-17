package assignments.arrays.flightbookingsystem;

import java.util.Scanner;

public class FlightBookingSystem {
    public static void main(String[] args) {
        Flight flight=new Flight();
        Scanner sc = new Scanner(System.in);
        String input=" ";
        System.out.println("Welcome to Flight booking system  \nEnter the destinations:");
        for(int i=0;i<5;i++){
            System.out.print("Enter destination "+(i+1)+": ");
            flight.destinations[i]=sc.next();
        }

        do{
            System.out.print("Select 1 to search,  2 for update , 3 for exit : ");
            int option=sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter the destination to search");
                    String destination=sc.next();
                    flight.findDestination(destination);
                    break;
                case 2:
                    System.out.println("Destinations available : ");
                    flight.display();
                    System.out.print("Enter the destination to replace: ");
                    String oldDestination=sc.next();
                    System.out.print("Enter the new title: ");
                    String newDestination=sc.next();
                    flight.replace(oldDestination,newDestination);
                    break;
                case 3:
                        System.out.println("Thank you for using flight booking system");
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
