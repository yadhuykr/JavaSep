package assignments.arrays.movieratingsystem;

public class Rating {
    String[] movies=new String[5];
    int[] ratings =new int[5];

    public void displayHighest(){
        int index=0;
        int highest=ratings[0];
        for(int i=1;i<5;i++){
            if(highest<ratings[i]){
                highest=ratings[i];
                index=i;
            }
        }
        System.out.println("The highest rating is "+highest+" for the movie "+movies[index]);
    }
}
