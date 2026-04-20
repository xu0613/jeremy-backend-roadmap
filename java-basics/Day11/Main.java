package Day11;

public class Main {
    public static void main(String[] args) {
        String sentence = "I am learning Java and SQL.";

        System.out.println(sentence.length());

        System.out.println(sentence.contains("Java"));

        System.out.println(sentence.substring(0,4));

        String word = "Java";
        String anotherWord = "java";
        System.out.println(word.equals(anotherWord));
        System.out.println(word.equalsIgnoreCase(anotherWord));

        String language = "Java,SQL,Linux,Git";

        String[] list = language.split(",");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
