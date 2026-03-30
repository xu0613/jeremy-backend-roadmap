package Day9.exercise2;

public class Main {
    public static void main(String[] args) {
        try {
            int [] arr = new int[3];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            System.out.println(arr[8]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("数组下标越界");
        }
    }
}
