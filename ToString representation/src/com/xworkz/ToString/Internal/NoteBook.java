package com.xworkz.ToString.Internal;

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
    @Override
    public int hashCode() {
        return -1258;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof NoteBook) {
                NoteBook noteBook1 = this;
                NoteBook noteBook2 = (NoteBook) obj;
                if (noteBook1.brand.equals(noteBook2.brand) && noteBook1.pages == noteBook2.pages) {
                    System.out.println("Same brand and number of pages");
                    return true;
                }
            }
        }
        return false;
    }
}
