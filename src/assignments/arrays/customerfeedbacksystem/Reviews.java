package assignments.arrays.customerfeedbacksystem;

public class Reviews {
    String[] reviews = new String[5];

    public void display(){
        System.out.println("Reviews :");
        for(int i=0;i<5;i++){
            System.out.println(i+"."+reviews[i]);
        }
    }

    public void search(String phrase){
        boolean found=false;
        for(int i=0;i<5;i++){
            if(reviews[i].contains(phrase)){
                found=true;
                System.out.println(("Review found: "+(i+1)+"."+reviews[i]));
            }
        }
        if(!found){
            System.out.println("No reviews found with the words entered.");
        }
    }

}
