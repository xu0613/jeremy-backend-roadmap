package librarybook;

public class Main {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Harry Potter", "J.K. Rowling", false);

        b1.showInfo();
        b1.borrowBook();
        b1.showInfo();
        b1.returnBook();
        b1.showInfo();
    }
}
