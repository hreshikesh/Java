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
}
