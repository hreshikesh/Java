package com.xworkz.tostring.Internal;

public class Calender {
    private String year;
    private String theme;
    private int price;

    public Calender(String year, String theme, int price) {
        this.year = year;
        this.theme = theme;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Calendar year: " +  this.year + ", theme: " +  this.theme + ", price: " +  this.price;
    }
    @Override
    public int hashCode() {
        return 5100;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Calender) {
                Calender calendar1 = this;
                Calender calendar2 = (Calender) obj;
                if (calendar1.year.equals(calendar2.year) &&
                        calendar1.theme.equals(calendar2.theme) &&
                        calendar1.price == calendar2.price) {
                    System.out.println("Same year, theme, and price");
                    return true;
                }
            }
        }
        return false;
    }

}
