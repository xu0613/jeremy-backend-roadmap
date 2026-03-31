package Day10.exercise;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main {
    public static void main (String[] args) {
//        try (FileWriter writer = new FileWriter("java-basics/Day10/exercise/study.txt");) {
//            writer.write("I am studying Java IO.\n");
//            writer.write("Hope me good luck.\n");
//            writer.close();
//        } catch (IOException e) {
//            System.out.println("Went Wrong!");
//        }
        try (BufferedReader reader = new BufferedReader(new FileReader("java-basics/Day10/exercise/study.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Went Wrong");
        }


    }
}
