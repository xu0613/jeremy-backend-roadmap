package Day10.read;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class Main {
    public static void main (String[] args) {
        try {
                FileReader reader = new FileReader("output.txt");
                int ch;
                while ((ch = reader.read()) != -1) {
                    System.out.println((char) ch);
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("Something went wrong.");
            }
    }

}
