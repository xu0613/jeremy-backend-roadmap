package Day9.exercise4;

public class Main {
    public static void checkTemperature(int temp) {
        if (temp < -50 || temp > 50) {
            throw new IllegalArgumentException("Temperature out of range");
        } else {
            System.out.println("Temperature found");
        }
    }
    public static void main(String[] args) {
        try {
            checkTemperature(120);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
