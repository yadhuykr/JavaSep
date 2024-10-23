package oops.inheritance.vehicleshowroom;

public class Car extends Vehicle {
    int doors;

    @Override
    public void displayInfo() {
        System.out.println("Brand is "+brand+" and speed is "+speed+" with doors "+doors);
    }
}
