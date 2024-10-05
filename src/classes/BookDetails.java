package classes;

public class BookDetails {
    public static void main(String[] args) {
        Book book=new Book();
        Book book1=new Book("A gentleman in Moscow");
        Book book2=new Book("A gentleman in Moscow","Amor Towles");
        Book book3=new Book("A gentleman in Moscow","Amor Towles",2016);
        Book book4=new Book("A gentleman in Moscow","Amor Towles",2016,24.95f);
        Book book5=new Book("A gentleman in Moscow","Amor Towles",2016,24.95f,"Fiction");

        System.out.println("zero argument constructor");
        book.getBookDetails();
        System.out.println("One argument constructor");
        book1.getBookDetails();
        System.out.println("Two argument constructor");
        book2.getBookDetails();
        System.out.println("Three argument constructor");
        book3.getBookDetails();
        System.out.println("Four argument constructor");
        book4.getBookDetails();
        System.out.println("Five argument constructor");
        book5.getBookDetails();
    }
}
