package conditionals;

public class conditionalDemo {

    public static void main(String[] args){
        int x=21;
        int y =-2;
        int  year = 2024;
        int age = 14;

        if (x%2==0){
            System.out.println(x+" is even");
        }else{
            System.out.println(x+" is odd");
        }

        if (y>0){
            System.out.println(y+" is positive");
        }else{
            System.out.println(y+" is negative");
        }

        if (year%400==0 || ((year%4==0)&&(year%100!=0))){
            System.out.println(year+" is Leap year");
        }else{
            System.out.println(year+" is not leap year");
        }

        if (age>=16){
            System.out.println("Can drive");
        }else{
            System.out.println("Can't drive");
        }

        if (age>=18){
            System.out.println("Can vote");
        }else{
            System.out.println("Can't vote");
        }



    }
}
