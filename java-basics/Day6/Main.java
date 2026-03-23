package Day6;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Coco");
        d1.eat();
        d1.makeSound();
        d1.bark();

        System.out.println();

        Cat c1 = new Cat("Mimi");
        c1.eat();
        c1.makeSound();
        c1.meow();

        System.out.println();

        Animal a1 = new Dog("Buddy");
        Animal a2 = new Cat("Luna");

        a1.makeSound();
        a2.makeSound();


    }
}
