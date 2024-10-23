package oops.inheritance.vehicleshowroom;

public class Bike extends Vehicle{
    String type;

    @Override
    public void displayInfo() {
        System.out.println("Brand is "+brand+" and speed is "+speed+" type is "+type);
    }
}
