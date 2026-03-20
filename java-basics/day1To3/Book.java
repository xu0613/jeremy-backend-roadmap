package day1To3;

class Book {
    String title;
    String author;
    double price;

    void setInfo(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void showInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    void read() {
        System.out.println("I am reading " + title + ".");
    }
}
