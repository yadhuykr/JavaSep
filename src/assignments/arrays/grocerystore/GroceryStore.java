package assignments.arrays.grocerystore;

import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        FruitsCatalog fruitsCatalog=new FruitsCatalog();
        fruitsCatalog.fruits= new String[]{"Mango", "Apple", "Banana", "Orange", "Pineapple"};
        fruitsCatalog.priceperkg=new float[]{10,20,30,40,50};
        Scanner sc= new Scanner(System.in);
        String input=" ";

        System.out.println("Welcome to our grocery store!! Fruits and there prices available today:");
        fruitsCatalog.display();

        do{
            System.out.print("How many fruit varieties do you want to buy: ");
            int size=sc.nextInt();
            float totalprice=0;
            if(size>5){
                System.out.println("Uh oh we only have 5 vaieties!!");
            }else{
                String[] fruitstobuy=new String[size];
                float[] kgs=new float[size];
                float[] prices=new float[size];
                for(int i=0;i<size;i++){
                    System.out.print("Enter the fruit "+(i+1)+" :");
                    fruitstobuy[i]=sc.next();
                    while(!fruitsCatalog.ifFruitFound(fruitstobuy[i])){
                        System.out.println("Fruit not found!! Try again");
                        System.out.print("Enter the fruit "+(i+1)+" :");
                        fruitstobuy[i]=sc.next();
                    }
                    System.out.print("Enter the quantity(in kg) for "+fruitstobuy[i]+" :");
                    kgs[i]=sc.nextFloat();
                    prices[i]=fruitsCatalog.priceCalculator(fruitstobuy[i],kgs[i]);
                }
                System.out.println("\n-----Your bill-----");
                for(int i=0;i<size;i++){
                    System.out.println(fruitstobuy[i]+"------"+kgs[i]+"kg  =  "+"$"+prices[i]);
                    totalprice+=prices[i];
                }
                System.out.println("Your total price is :$"+totalprice);
            }

            System.out.print("Do you want to try again: yes or no ");
            input=sc.next();
        }while(input.equalsIgnoreCase("yes"));

        System.out.println("Thank you for shopping with us");


    }
}
