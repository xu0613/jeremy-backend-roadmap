package Day8.fruits;
import java.util.ArrayList;

public class Main {
    public static void main (String [] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Strawberry");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();
        System.out.println(fruits.get(1));
        System.out.println();

        fruits.set(2, "watermelon");

        fruits.remove(0);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
