package calc;
import java.util.Scanner;
public class UserInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        System.out.println(num);
    }
}
