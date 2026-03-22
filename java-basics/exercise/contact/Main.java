package contact;

public class Main {
    public static void main(String[] args) {
        contact c1 = new contact("Jeremy", "666666", "666666@666.com");
        c1.showInfo();
        c1.setPhone("8888888");
        System.out.println(c1.getPhone());
    }
}
