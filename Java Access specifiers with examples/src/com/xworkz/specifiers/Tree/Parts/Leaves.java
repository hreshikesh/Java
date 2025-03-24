package com.xworkz.specifiers.Tree.Parts;



public class Leaves {
    public String leafType;
    private int leafCount;
    String color;

    public Leaves(String leafType, int leafCount, String color) {
        this.leafType = leafType;
        this.leafCount = leafCount;
        this.color = color;
    }

    private void checkLeafCount() {
        System.out.println("Total Leaves: " + this.leafCount);
    }

    public void leafDetails() {
        System.out.println("Leaf Type: " + this.leafType);
        System.out.println("Leaf Color: " + this.color);
        checkLeafCount();
    }
}
