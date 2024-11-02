package oops.polymorphism;

public class Contractor extends Employee{

    private final double wage;
    private final int hour;

    public Contractor(double wage, int hour) {
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double calculateSalary() {
        return wage*hour;
    }
}
