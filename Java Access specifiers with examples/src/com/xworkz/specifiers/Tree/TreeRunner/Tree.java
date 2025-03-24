package com.xworkz.specifiers.Tree.TreeRunner;

public class Tree {
    public String treeName;
    private int age;
    String height;


    Tree(String treeName, int age, String height) {
        this.treeName = treeName;
        this.age = age;
        this.height = height;
    }


    void displayTreeDetails() {
        System.out.println("Tree Name: " + this.treeName);
        System.out.println("Tree Age: " + this.age + " years");
        System.out.println("Tree Height: " + this.height);
    }


    private void provideOxygen() {
        System.out.println("The tree is providing oxygen.");
    }

    public void grow() {
        System.out.println("The tree is growing...");
        provideOxygen();
    }
}
