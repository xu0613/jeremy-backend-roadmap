package Day10.write;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main (String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt", true);
//            writer.write("My name is Jeremy.\n");
//            writer.write("I am learning Java IO.\n");
//            writer.write("This is Day 10.\n");
            writer.write("New line added.\n");
            writer.close();
//            System.out.println("Write finished");
            System.out.println("Append finished");
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }
    }
}
