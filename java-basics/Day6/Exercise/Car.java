package Day6.Exercise;

public class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    @Override
    void move() {
        System.out.println("Driving the " + brand);
    }
}
