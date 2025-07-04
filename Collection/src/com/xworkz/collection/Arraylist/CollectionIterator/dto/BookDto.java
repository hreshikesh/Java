package com.xworkz.collection.Arraylist.CollectionIterator.dto;


import java.io.Serializable;

public class BookDto implements Serializable {
    private String bookName;
    private String authorName;
    private String publisherName;
    private String bookType;
    private String bookReference;
    private String bookLanguage;
    private String location;
    private int price;
    private String bookRating;
    private String bookEdition;

    public BookDto(){
    }
    public BookDto(String bookName, String authorName, String publisherName, String bookType, String bookReference, String bookLanguage, String location, int price, String bookRating, String bookEdition) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.bookType = bookType;
        this.bookReference = bookReference;
        this.bookLanguage = bookLanguage;
        this.location = location;
        this.price = price;
        this.bookRating = bookRating;
        this.bookEdition = bookEdition;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(String bookEdition) {
        this.bookEdition = bookEdition;
    }

    public String getBookLanguage() {
        return bookLanguage;
    }

    public void setBookLanguage(String bookLanguage) {
        this.bookLanguage = bookLanguage;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookRating() {
        return bookRating;
    }

    public void setBookRating(String bookRating) {
        this.bookRating = bookRating;
    }

    public String getBookReference() {
        return bookReference;
    }

    public void setBookReference(String bookReference) {
        this.bookReference = bookReference;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "authorName='" + authorName + '\'' +
                ", bookName='" + bookName + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", bookType='" + bookType + '\'' +
                ", bookReference='" + bookReference + '\'' +
                ", bookLanguage='" + bookLanguage + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", bookRating='" + bookRating + '\'' +
                ", bookEdition='" + bookEdition + '\'' +
                '}';
    }
}
