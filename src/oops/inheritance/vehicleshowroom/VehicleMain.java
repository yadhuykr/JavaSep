package oops.inheritance.vehicleshowroom;

import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand="Mazda";
        car.speed=140;
        car.doors=4;
        System.out.println("Car details:");
        car.displayInfo();

        Bike bike=new Bike();
        bike.brand="Kawasaki";
        bike.speed=190;
        bike.type="Sports bike";
        System.out.println("Bike details:");
        bike.displayInfo();

    }
}
