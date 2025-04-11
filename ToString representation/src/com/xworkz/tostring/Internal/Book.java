package com.xworkz.tostring.Internal;

public class Book {
    private String company;
    private int noOfPages;
    private int cost;

    public Book(String company,int noOfPages,int cost){
        this.company=company;
        this.noOfPages=noOfPages;
        this.cost=cost;
    }

    @Override
    public String toString() {
        return "Book brand "+this.company+" Book cost "+this.cost+" Book total Page "+this.noOfPages;
    }
    @Override
    public int hashCode() {
        return 5;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Book) {
                Book book1 = this;
                Book book2 = (Book) obj;
                if (book1.cost == book2.cost) {
                    System.out.println("Same cost");
                    return true;
                }
            }
        }
        return false;
    }
}
