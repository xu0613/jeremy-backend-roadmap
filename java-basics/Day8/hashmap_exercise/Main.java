package Day8.hashmap_exercise;
import java.util.HashMap;

public class Main {
    public static void main (String[] args) {
        HashMap<String, Integer> score = new HashMap<>();
        score.put("Jeremy", 100);
        score.put("Wilson", 0);
        score.put("Jack", 90);

        score.put("Wilson", 99);
        score.remove("Jack");

        for (HashMap.Entry<String, Integer> entry : score.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
