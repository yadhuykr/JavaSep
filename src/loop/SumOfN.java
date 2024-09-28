package loop;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        System.out.print("Enter the limit: ");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int start = 1;
        int sum=0;
        while(start<=limit){
            sum=sum+start;
            start++;
        }
        System.out.println("Sum is "+sum);
    }
}
