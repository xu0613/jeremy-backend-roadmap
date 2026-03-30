package Day9.exercise3;

public class Main {
    public static int parseNumber(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        try {
            int num = parseNumber("abc");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("输入的不是合法数字");
        }

        System.out.println("程序结束");
    }
}
