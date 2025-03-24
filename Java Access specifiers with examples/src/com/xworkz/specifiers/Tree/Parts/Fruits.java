package com.xworkz.specifiers.Tree.Parts;


public class Fruits {
    public String fruitName;
    private String taste;
    String season;

    public Fruits(String fruitName, String taste, String season) {
        this.fruitName = fruitName;
        this.taste = taste;
        this.season = season;
    }

    public void fruitDetails(Leaves leaves) {
        System.out.println("Fruit Name: " + fruitName);
        System.out.println("Season: " + season);
        checkTaste();
        leaves.leafDetails();

    }

    private void checkTaste() {
        System.out.println("Taste of the fruit: " + taste);
    }
}

