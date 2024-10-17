package assignments.arrays.classroomattendancetracker;

import java.util.Scanner;

public class ClassRoomAttendanceTracker {
    public static void main(String[] args) {
        Attendance attendance=new Attendance();
        Scanner sc = new Scanner(System.in);
        String input="";
        System.out.println("*****Welcome to Attendance tracker*****");
        System.out.println("Enter the name(5 students): ");
        for(int i=0;i<5;i++){
            attendance.names[i]=sc.nextLine();
        }

        do {
            System.out.print("Enter the student name you want to check: ");
            String name = sc.nextLine();
            attendance.find(name);
            System.out.print("Do you want to continue: yes or no ");
            input=sc.nextLine();
        }while(input.equalsIgnoreCase("yes"));

    }
}
