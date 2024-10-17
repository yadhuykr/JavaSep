package assignments.arrays.librarymanagement;

public class Library {
    String[] titles= new String[6];

    public void display(){
        for(String book:titles){
            System.out.println(book);
        }
    }

    public void findBook(String book){
        boolean found=false;
        int index=-1;
        for(int i=0;i<6;i++){
            if(titles[i].equalsIgnoreCase(book)){
                found=true;
                index=i;
            }
        }
        if(found){
            System.out.println("Book found - "+titles[index]+". It was book number "+(index+1)+" you entered");
        }else{
            System.out.println("Not found!!!");
        }

    }

    public void replace(String existingBook, String newBook){
        boolean found = false;
        int index=-1;
        for(int i=0;i<6;i++) {
            if (titles[i].equalsIgnoreCase(existingBook)) {
                found = true;
                index=i;
            }
        }
            if(found){
                titles[index] = newBook;
                System.out.println("Book found and replaced ");
                System.out.println("Updated book catalog");
                for(String book:titles){
                    System.out.println(book);
                }
            }else {
                System.out.println("Entered book not found. Hence cannot replace");
            }
    }
}
