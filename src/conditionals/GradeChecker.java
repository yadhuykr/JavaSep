package conditionals;

public class GradeChecker {

    public static void main(String[] args) {
        int marks = 50;
        if (marks < 60) {
            System.out.println("Grade is F");
        } else if (marks >= 60 && marks < 60) {
            System.out.println("Grade is D");
        } else if (marks >=70 && marks < 80) {
            System.out.println("Grade is C");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade is B");
        } else {
            System.out.println("Grade is A");
        }
    }
}
