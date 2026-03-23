package Day6.Exercise;

public class Bike extends Vehicle {
    Bike(String brand) {
        super(brand);
    }

    @Override
    void move() {
        System.out.println("Riding the " + brand);
    }
}
