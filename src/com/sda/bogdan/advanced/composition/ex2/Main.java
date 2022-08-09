package com.sda.advanced.composition.ex2;

/**
 * Write a Java class Author with following features:
 * Instance variables :
 * firstName for the author’s first name of type String.
 * lastName for the author’s last name of type String.
 * Constructor:
 * A constructor with parameters, it creates the Author object by setting the two fields to the passed values.
 * Instance methods:
 * Getters and setters for variables
 * toString(): This method printed out author’s name to the screen
 * Write a Java class Book with following features:
 * Instance variables :
 * title for the title of book of type String.
 * author for the author’s name of type String.
 * price for the book price of type double.
 * Constructor:
 * A constructor with parameters, it creates the Author object by setting the fields to the passed values.
 * Instance methods:
 * Getters and setters for variables
 * toString(): This method printed out book’s details to the screen
 * Write a separate class BookDemo with a main() method creates a Book titled “Developing Java Software” with authors Russel Winderand price 79.75. Prints the Book’s string representation to standard output (using System.out.println)
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", "author1", "author2", 100, "1");
        System.out.println(book1);
        Author author1 = new Author("A", "B");
        Book book2=new Book ("Book2", author1,200,"2");
        System.out.println(book2);
        Book book3=new Book("Book3", author1, 300,"3");
        System.out.println(book3);
    }

}
