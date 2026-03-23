package Day6;

public class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " says: Meow!");
    }

    void meow() {
        System.out.println(name + " is meowing.");
    }
}
