package Day6.Exercise;

public class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand=brand;
    }

    void move() {
        System.out.println("Moving the " + brand);
    }
}
