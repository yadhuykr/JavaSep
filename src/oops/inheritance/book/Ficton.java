package oops.inheritance.book;

public class Ficton extends Book{

    String author;
    float price;

    public Ficton(String genre, String title,String author,float price) {
        super(genre, title);
        this.author=author;
        this.price=price;

    }

    public void displayInfo() {
        System.out.println("Fiction book details");
        System.out.println(genre+" "+title+" "+author+" "+price);
    }
}
