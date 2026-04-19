package CollectionReview;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Tom");
        students.add("Alice");
        students.add("Bob");
        students.add("Cindy");
        students.add("David");

        for(String student : students) {
            System.out.println(student);
        }

        System.out.println(students.get(1));
        students.set(2, "Ben");
        students.remove("David");
        students.add("Eric");
        System.out.println(students.size());
        System.out.println(students.contains("Alice"));

        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("Tom", 85);
        scores.put("Alice", 92);
        scores.put("Bob", 76);
        scores.put("Cindy", 88);
        scores.put("David", 60);

        for(String name : scores.keySet()) {
            System.out.println(name + ": " + scores.get(name));
        }

        System.out.println(scores.get("Alice"));
        scores.put("Bob", 79);
        scores.remove("David");
        scores.put("Eric", 95);
        System.out.println(scores.size());
        System.out.println(scores.containsKey("Cindy"));

        for(HashMap.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for(String student : students) {
            if(scores.containsKey(student)) {
                System.out.println(student + ": " + scores.get(student));
            } else {
                System.out.println(student + " does not exist");
            }
        }

        int total = 0;
        int maxScore = 0;
        String topStudent = "";
        for(HashMap.Entry<String, Integer> entry : scores.entrySet()) {
            total += entry.getValue();
            if(entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        boolean hasBelow80 = false;

        System.out.println("Students below 80:");

        for (HashMap.Entry<String, Integer> entry : scores.entrySet()) {
            if (entry.getValue() < 80) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
                hasBelow80 = true;
            }
        }

        if (!hasBelow80) {
            System.out.println("No students below 80.");
        }

        double average = (double) total / scores.size();
        System.out.println("Average score: " + average);
        System.out.println("Total score: " + total);
        System.out.println("Top student: " + topStudent);
        System.out.println("Max score: " + maxScore);

    }
}
