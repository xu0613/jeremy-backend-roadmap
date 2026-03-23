package Day6;

public class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " says: Woof!");
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}
