package com.xworkz.isarelation.Internal;

public class Novel extends Book{
    public Novel() {
        System.out.println("Running no-arg constructor of Novel");
    }
    @Override
    public void read() {
        System.out.println("Reading a book in subclass");
    }
    @Override
    public void bookmark() {
        System.out.println("Bookmarking a page in subclass");
    }
    @Override
    public void close() {
        System.out.println("Closing the book in subclass");
    }
    @Override
    public void lend() {
        System.out.println("Lending the book to someone in subclass");
    }
    @Override
    public void store() {
        System.out.println("Storing the book on a shelf in subclass");
    }
}
