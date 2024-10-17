package assignments.arrays.flightbookingsystem;

public class Flight {
    String[] destinations = new String[5];

    public void display(){
        for(String book: destinations){
            System.out.println(book);
        }
    }

    public void findDestination(String destination){
        boolean found=false;
        int index=-1;
        for(int i=0;i<5;i++){
            if(destinations[i].equalsIgnoreCase(destination)){
                found=true;
                index=i;
            }
        }
        if(found){
            System.out.println("Flight found for "+ destinations[index]);
        }else{
            System.out.println("Not found!!!");
        }

    }

    public void replace(String existingDestination, String newDestination){
        int index=-1;
        boolean found=false;
        for(int i=0;i<5;i++) {
            if (destinations[i].equalsIgnoreCase(existingDestination)) {
                found = true;
                index = i;
            }
        }
            if(found){
                destinations[index]=newDestination;
                System.out.println("Destination found and replaces ");
                System.out.println("Updated destinations");
                for(String destination: destinations){
                    System.out.println(destination);
                }
            }else{
                System.out.println("Entered destination not found cannot replacd!!");
            }
        }

}
