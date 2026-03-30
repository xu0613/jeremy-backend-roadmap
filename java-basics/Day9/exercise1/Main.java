package Day9.exercise1;

public class Main {
    public static void main(String[] args) {
        try {
            int a,b;
            a = 10;
            b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }
    }
}
