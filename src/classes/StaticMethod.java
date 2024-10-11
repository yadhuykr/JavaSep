package classes;

public class StaticMethod{

    public static void test(){
        System.out.println("This is test method... ");
    }

    static {
        System.out.println("This is static block ");
        int count =1;
        System.out.println(count+" ");
    }


    StaticMethod(){
        System.out.println("This is the constructor");
    }

    {
        System.out.println("Instance block    ");
        int count =1;
        System.out.println(count);
    }

    public void myMethod(){
        System.out.println("non static method.... ");
    }


    static  {
        System.out.println("Second static block..");
    }

}

class Main {
    public static void main(String[] args) {
        StaticMethod staticMethod = new StaticMethod();
        StaticMethod staticMethod1 = new StaticMethod();
        System.out.println();




    }
}

