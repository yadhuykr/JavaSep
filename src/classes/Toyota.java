package classes;

public class Toyota {
    public static void main(String[] args) {
        Car car = new Car();

        car.brand="Toyota";
        car.model="Corolla";
        car.price=35000;

        System.out.println(car.brand);
        System.out.println(car.model);
        System.out.println(car.price);
        car.getBrand();
    }
}
