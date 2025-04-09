package com.xworkz.tostring.Internal;

public class Printer {
    private String brand;
    private boolean colorPrint;
    private int pagesPerMinute;

    public Printer(String brand, boolean colorPrint, int pagesPerMinute) {
        this.brand = brand;
        this.colorPrint = colorPrint;
        this.pagesPerMinute = pagesPerMinute;
    }

    @Override
    public String toString() {
        return "Printer brand: " + brand + ", colorPrint: " + colorPrint + ", PPM: " + pagesPerMinute;
    }
}
