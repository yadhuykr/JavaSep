package assignments.arrays.movieratingsystem;

import java.util.Scanner;

public class MovieRatingSystem {
    public static void main(String[] args) {
        Rating rating=new Rating();
        Scanner sc = new Scanner(System.in);

        System.out.println("----Welcome to movie rating system----");
        for(int i=0;i<5;i++){
            System.out.print("Enter movie number "+(i+1)+": ");
            rating.movies[i]=sc.nextLine();
            System.out.print("Enter the rating for "+(rating.movies[i])+" : ");
            rating.ratings[i]=sc.nextInt();
            sc.nextLine();
        }
        rating.displayHighest();

    }
}
