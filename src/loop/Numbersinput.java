package loop;

import java.util.Scanner;

public class Numbersinput {
    public static void main(String[] args) {
        System.out.print("Enter the limit: ");
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int i = 1;
        while(i<=inp){
            System.out.println(i);
            i++;
        }
    }
}
