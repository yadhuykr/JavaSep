package assignments.arrays.librarymanagement;

import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library=new Library();
        Scanner sc = new Scanner(System.in);
        String input=" ";
        System.out.println("Welcome to Library Management \nEnter the book titles :");
        for(int i=0;i<6;i++){
            System.out.print("Enter title "+(i+1)+": ");
            library.titles[i]=sc.next();
        }
        System.out.println("New Book catalogue: ");
        library.display();
        do{
            System.out.print("Select 1 to search,  2 for update , 3 for exit : ");
            int option=sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter the title to search");
                    String title=sc.next();
                    library.findBook(title);
                    break;
                case 2:
                    System.out.print("Enter the title to replace: ");
                    String oldtitle=sc.next();
                    System.out.print("Enter the new title: ");
                    String newtitle=sc.next();
                    library.replace(oldtitle,newtitle);
                    break;
                case 3:
                    System.out.println("Thank you for using library management");
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
