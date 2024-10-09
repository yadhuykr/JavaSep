package classes;

public class BookConst {

    String title;
    String author;

    public BookConst(){
        this.title="unknown";
        this.author="unknown";
        System.out.println("no parameter "+this.title+" "+this.author);
    }

    public BookConst(String title){
        this();
        this.title=title;
        System.out.println("one paramter "+this.title+" "+this.author);

    }

    public BookConst(String title, String author){
        this(title);
        this.author=author;
        System.out.println("two paramter "+this.title+" "+this.author);
    }


    public static void main(String[] args) {
        BookConst bookConst=new BookConst("Test","Test");

    }

}
