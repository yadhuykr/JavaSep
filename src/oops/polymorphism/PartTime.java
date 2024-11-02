package oops.polymorphism;

public class PartTime extends Employee {
    private final int hours;
    private final double wage;

    public PartTime(int hours, double wage) {
        this.hours = hours;
        this.wage = wage;
    }

    @Override
    public double calculateSalary() {
        return hours*wage;
    }
}
