package loop;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        System.out.println("Welcome to Niagara Falls Casino!!!  Guess a number between 1 and 100!! " +
                "You have 3 attempts to hit the jackpot!!");
        int luckyno = 13;
        Scanner sc = new Scanner(System.in);
        int guess;
        String choice;
        do {
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter your guess number " + i + ": ");
                guess = sc.nextInt();
                if (guess == luckyno) {
                    System.out.println("Congrats you won the jackpot!! Lucky number is " + guess);
                    break;
                } else {
                    if (i == 3) {
                        System.out.println("Sorry you have exhausted all the attempts!!Exiting");
                    } else {
                        System.out.println("Sorry try again");
                    }
                }
            }
            System.out.println("Do you want to play again? y or n");
            choice=sc.next();
        }while(choice.equalsIgnoreCase("y"));
    }
}
