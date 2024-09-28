package loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        if (n==0){
            System.out.println("Factorial is 1");
        }else {
            int i=1;
            int fact=1;
            do{
                fact=fact*i;
                i++;
            }while(i<=n);
            System.out.println("Factorial is "+fact);
        }

    }
}
