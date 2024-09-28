package loop;

import java.util.Scanner;

public class ProductTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int i=1;
        do{
            System.out.println(n+" * "+i+" = "+(n*i));
            i++;
        }while(i<=10);
    }
}
