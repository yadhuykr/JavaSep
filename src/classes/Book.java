package classes;

public class Book {
    String title;
    String author;
    int year;
    float price;
    String genre;

    Book(){

    }

    public Book(String title){
        this.title=title;
    }
    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }
    public Book(String title, String author,int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }

    public Book(String title, String author, int year, float price ){
        this.title=title;
        this.author=author;
        this.year=year;
        this.price=price;
    }

    public Book(String title, String author, int year, float price,String genre ){
        this.title=title;
        this.author=author;
        this.year=year;
        this.price=price;
        this.genre=genre;
    }

    public void getBookDetails(){
        System.out.println("Book details:");
        System.out.print("Title: "+title);
        System.out.print("  Author Name: "+author);
        System.out.print("  Year published: "+year);
        System.out.print("  Price: "+price);
        System.out.println("  Genre: "+genre);
    }





}
