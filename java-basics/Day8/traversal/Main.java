package Day8.traversal;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }

        for (Integer nums : num) {
            System.out.println(nums);
        }
    }
}
