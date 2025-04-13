package com.xworkz.ToString.Internal;

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
    @Override
    public int hashCode() {
        return 10258740;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Printer) {
                Printer printer1 = this;
                Printer printer2 = (Printer) obj;
                if (printer1.brand.equals(printer2.brand) &&
                        printer1.colorPrint == printer2.colorPrint &&
                        printer1.pagesPerMinute == printer2.pagesPerMinute) {
                    System.out.println("Same brand, colorPrint and pagesPerMinute");
                    return true;
                }
            }
        }
        return false;
    }

}
