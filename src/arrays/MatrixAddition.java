package arrays;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the size of the matrix (row and columns) :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter the elements now");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter element "+i+j+" :");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The sum is "+addition(arr,r,c));
    }

    public static int addition(int[][] arr,int r, int c){
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
}
