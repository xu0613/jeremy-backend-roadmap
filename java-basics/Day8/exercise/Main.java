package Day8.exercise;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("A");
        students.add("B");
        students.add("C");
        students.add("D");
        students.add("E");

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println(students.get(2));

        students.set(1, "F");

        students.remove(0);

        System.out.println(students.size());

        System.out.println(students.contains("A"));

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("A", 90);
        scores.put("B", 90);
        scores.put("C", 90);
        scores.put("D", 90);
        scores.put("E", 90);

        System.out.println("A:" + scores.get("A"));

        scores.put("A", 88);

        scores.remove("E");

        System.out.println(scores.size());

        System.out.println(scores.containsKey("A"));

        for (HashMap.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();

        for (String score : students) {
            if (!scores.containsKey(score)) {
                System.out.println(score + " have no score");
            } else {
                System.out.println(score + ": " + scores.get(score));
            }
        }


        }
    }
