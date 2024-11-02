package oops.polymorphism;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee fullTime = new FullTime(3000);
        Employee partTime = new PartTime(80,45);
        Employee contractor = new Contractor(120,50);

        System.out.println("Full time employee salary: "+fullTime.calculateSalary());
        System.out.println("Part time employee salary "+partTime.calculateSalary());
        System.out.println("Contractor salary " +contractor.calculateSalary());
    }
}
