package oops.inheritance.book;

public class NonFiction extends Book {

    String author;
    float price;

    public NonFiction(String genre, String title, String auhtor,float price) {
        super(genre, title);
        this.author=auhtor;
        this.price=price;
    }
    public void displayInfo(){
        System.out.println("Non-Fiction book details");
        System.out.println(genre+" "+title+" "+author+" "+price);
    }
}
