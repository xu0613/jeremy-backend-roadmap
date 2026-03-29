package Day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String [] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Tom");
        students.add("Jerry");
        students.add("Alice");

        System.out.println("学生名单：");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println();

        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("Tom", 90);
        scores.put("Jerry", 95);
        scores.put("Alice", 85);

        System.out.println("学生成绩：");
//        for (String name : scores.keySet()) {
//            System.out.println(name + "-->" + scores.get(name));
//        }
        for (HashMap.Entry<String,Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
