package loop;

import java.util.Scanner;

public class NumbersDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();
        int i=1;
        int sum=0;
        do{
          sum=sum+i;
          i++;
        }while(i<=n);
        System.out.println("Sum is :"+sum);
    }
}
