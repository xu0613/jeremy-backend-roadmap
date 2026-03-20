package carExercise;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 300000);
        c1.showInfo();
        c1.setPrice(280000);
        System.out.println(c1.getPrice());
    }
}
