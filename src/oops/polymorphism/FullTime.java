package oops.polymorphism;

public class FullTime extends Employee{

    private final double biweeklySalary;

    public FullTime(double biweeklySalary) {
        this.biweeklySalary = biweeklySalary;
    }

    @Override
    public double calculateSalary() {
        return biweeklySalary*2;
    }
}
