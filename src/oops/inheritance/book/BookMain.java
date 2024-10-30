package oops.inheritance.book;

public class BookMain {
    public static void main(String[] args) {
        Ficton ficton=new Ficton("fiction","A murder in Venice","Agatah Chrisite",22);
        NonFiction nonFiction= new NonFiction("non-fiction","Wings of fire","APJ Kalam",20);

        ficton.displayInfo();
        nonFiction.displayInfo();
    }
}
