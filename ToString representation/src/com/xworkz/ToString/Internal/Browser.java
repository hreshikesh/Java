package com.xworkz.ToString.Internal;

public class Browser {
    private String name;
    private String version;
    private int releaseYear;

    public Browser(String name, String version, int releaseYear) {
        this.name = name;
        this.version = version;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Browser name: " + this. name + ", version: " +  this.version + ", release year: " +  this.releaseYear;
    }

    @Override
    public int hashCode() {
        return 1020;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Browser) {
                Browser browser1 = this;
                Browser browser2 = (Browser) obj;
                if (browser1.name.equals(browser2.name) &&
                        browser1.version.equals(browser2.version) &&
                        browser1.releaseYear == browser2.releaseYear) {
                    System.out.println("Same name, version and release year");
                    return true;
                }
            }
        }
        return false;
    }


}
