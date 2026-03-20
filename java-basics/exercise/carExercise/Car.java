package carExercise;

public class Car {
    private String brand;
    private int price;

    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    String getBrand() {
        return brand;
    }

    int getPrice() {
        return price;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price!");
        }
    }

    void showInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Price: " + getPrice());
    }


}
