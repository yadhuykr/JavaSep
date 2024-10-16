package arrays;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        int[] rev = new int[n];
        System.out.println("Now enter the numbers one by one :");
        for(int i=0;i<n;i++){
            System.out.println("Element "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Entered array is : ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        int start=0;
        int end=arr.length-1;
        int temp;
        while(start<end){
            temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        System.out.print("Reversed array is :");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
