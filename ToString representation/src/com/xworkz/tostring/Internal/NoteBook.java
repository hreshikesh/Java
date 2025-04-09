package com.xworkz.tostring.Internal;

public class NoteBook {
    private String brand;
    private int pages;
    private String size;
     public NoteBook(String brand, int pages, String size) {
        this.brand = brand;
        this.pages = pages;
        this.size = size;
    }
    @Override
    public String toString() {
        return "Notebook brand " + this.brand + " pages " + this.pages + " size " + this.size;
    }
}
