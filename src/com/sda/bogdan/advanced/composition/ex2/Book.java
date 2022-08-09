package com.sda.advanced.composition.ex2;

public class Book {
    private String title;
    private Author author;
    private double price;

    private final String isbn;

    public Book(String title, Author author, double price, String isbn) {
        this.title = title;
        this.author = author;
        setPrice(price);
        this.isbn=isbn;
    }

    public Book(String title, String authorFirstName, String authorLastName, double price, String isbn) {
        this(title, new Author(authorFirstName, authorLastName), price, isbn);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.err.println("Invalid price:" + price);
        }
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
