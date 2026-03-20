package day4;

public class Book {
    private String title;
    private String author;
    private double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    double getPrice() {
        return price;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }

    void showInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
