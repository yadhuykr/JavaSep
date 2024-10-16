package arrays;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Now enter the numbers one by one :");
        for(int i=0;i<n;i++){
            System.out.println("Element "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Entered array is : ");
        for(int i:arr){
            System.out.print(i+" ");
        }




    }


}
