package loop;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"Rock","Paper","Scissors"};
        Scanner sc = new Scanner(System.in);
        System.out.println("This is  Rock Paper Scissors match");
        System.out.print("How many rounds do you need :");
        int rounds=sc.nextInt();
        Random random = new Random();
        String choice;
        String randomChoice;
        int randomIndex;
        int userScore=0;
        int compScore=0;
        for (int i=1;i<=rounds;i++){
            String winner;
            System.out.println("Select your choice - Rock Paper or Scissor?");
            choice=sc.next();
            randomIndex=random.nextInt(choices.length);
            randomChoice=choices[randomIndex];
            winner=roundResults(choice,randomChoice);
            if (winner.equalsIgnoreCase("User")){
                userScore++;
                System.out.println("You selected "+choice+" I selected "+randomChoice);
                System.out.println("You win this round");
            }else if (winner.equalsIgnoreCase("Comp")){
                compScore++;
                System.out.println("You selected "+choice+" I selected "+randomChoice);
                System.out.println("I win this round");
            }else{
                System.out.println("You selected "+choice+" I selected "+randomChoice);
                System.out.println("Its a draw");
            }
        }
        if (userScore>compScore){
            System.out.println("You win the competition!!!!");
            System.out.println("Score : You - "+userScore+" Computer - "+compScore);
        }else if (userScore<compScore){
            System.out.println("You lose!!!");
            System.out.println("Score : You - "+userScore+" Computer - "+compScore);
        }else{
            System.out.println("It is a draw");
            System.out.println("Score : You - "+userScore+" Computer - "+compScore);
        }
    }

    public static String roundResults(String user,String random){
        String winner="";
        if(user.equalsIgnoreCase("Rock")){
            switch(random){
                case "Rock":
                    winner="Draw";
                    break;
                case "Paper":
                    winner="Comp";
                    break;
                case "Scissor":
                    winner="User";
                    break;
            }
        }
        if(user.equalsIgnoreCase("Paper")){
            switch(random){
                case "Rock":
                    winner="User";
                    break;
                case "Paper":
                    winner="Draw";
                    break;
                case "Scissor":
                    winner="Comp";
                    break;
            }
        }

        if(user.equalsIgnoreCase("Scissor")){
            switch(random){
                case "Rock":
                    winner="Comp";
                    break;
                case "Paper":
                    winner="User";
                    break;
                case "Scissor":
                    winner="Draw";
                    break;
            }
        }
        return winner;
    }
}
