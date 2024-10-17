package assignments.arrays.productinventorymanagement;

import java.util.Scanner;

public class ProductInventoryManagement {
    public static void main(String[] args) {
        ProductInventory productInventory=new ProductInventory();
        Scanner sc = new Scanner(System.in);
        String input=" ";
        System.out.println("Welcome to Product Inventory Management \nEnter the products :");
        for(int i=0;i<5;i++){
            System.out.print("Enter product "+(i+1)+": ");
            productInventory.products[i]=sc.next();
        }
        System.out.println("Enter the prices for the product ");
        for(int i=0;i<5;i++){
            System.out.print("Enter price for "+(productInventory.products[i])+": ");
            productInventory.prices[i]=sc.nextInt();
        }

        do{
            System.out.print("Select 1 to display the inventory,  2 for search , 3 for exit : ");
            int option=sc.nextInt();
            switch(option){
                case 1:
                    productInventory.display();
                    break;
                case 2:
                    System.out.println("Enter the product to search");
                    String product=sc.next();
                    productInventory.getPrice(product);
                    break;
                case 3:
                    System.out.println("Thank you for using product inventory management");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
            System.out.print("Do you want to continue: yes or no ");
            input=sc.next();


        }while(input.equalsIgnoreCase("yes"));
    }

}
