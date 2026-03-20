package day4;

public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student("Jeremy", 18, "ICS");
//
//        s1.introduce();
//
//        s1.setAge(19);
//        System.out.println("New age: " + s1.getAge());

        Book b1 = new Book("Harry Potter", "J.K. Rowling", 59.9);

        b1.showInfo();

        b1.setPrice(49.9);
        System.out.println("New price: " + b1.getPrice());
    }
}
