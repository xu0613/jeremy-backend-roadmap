package librarybook;

public class LibraryBook {
    private String title;
    private String author;
    private boolean isBorrowed;

    LibraryBook(String title, String author, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("This book is already borrowed.");
        } else {
            isBorrowed = true;
            System.out.println("Borrow successful.");
        }
    }

    void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Return successful.");
        } else {
            System.out.println("This book was not borrowed.");
        }
    }

    void showInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (isBorrowed) {
            System.out.println("Status: Borrowed");
        } else {
            System.out.println("Status: Available");
        }
    }
}