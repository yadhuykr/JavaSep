package loop;

public class ForDemo {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%7==0){
                System.out.println("Yadhu");
                continue;
            }
            System.out.println(i);
        }
    }
}
