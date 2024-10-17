package assignments.arrays.salesanalysis;

import assignments.arrays.movieratingsystem.Rating;

import java.util.Scanner;

public class SalesAnalysis {
    public static void main(String[] args) {
        Sales sales=new Sales();
        Scanner sc = new Scanner(System.in);
        String inp=" ";
        System.out.println("----Welcome to Sales Analysis System----");
        for(int i=0;i<7;i++){
            System.out.print("Enter product name "+(i+1)+": ");
            sales.products[i]=sc.nextLine();
            System.out.print("Enter the sakes for "+(sales.products[i])+" : ");
            sales.sales[i]=sc.nextInt();
            sc.nextLine();
        }
       do {
           System.out.print("Enter the product name to find the sales :");
           String prod = sc.nextLine();
           sales.search(prod);
           System.out.println("Do you want to try again- yes or no");
           inp=sc.nextLine();
       }while(inp.equalsIgnoreCase("yes"));

    }

}
