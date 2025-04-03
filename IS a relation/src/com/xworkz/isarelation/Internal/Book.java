package com.xworkz.isarelation.Internal;

public class Book {
    public Book() {
        System.out.println("Running no-arg constructor of Book");
    }

    public void read() {
        System.out.println("Reading a book");
    }

    public void bookmark() {
        System.out.println("Bookmarking a page");
    }

    public void close() {
        System.out.println("Closing the book");
    }

    public void lend() {
        System.out.println("Lending the book to someone");
    }

    public void store() {
        System.out.println("Storing the book on a shelf");
    }

}
