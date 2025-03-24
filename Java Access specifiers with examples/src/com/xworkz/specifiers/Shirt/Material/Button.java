package com.xworkz.specifiers.Shirt.Material;


public class Button{
    public String material;
    private int numberOfButtons;
    String shape;


    public Button(String material, int numberOfButtons, String shape) {
        this.material = material;
        this.numberOfButtons = numberOfButtons;
        this.shape = shape;
    }


    public void buttonDetails(Fabric fabric) {
        System.out.println("Button Material: " + material);
        System.out.println("Button Shape: " + shape);
        checkButtonCount();
        System.out.println("Fabric :");
        fabric.fabric();
    }

    private void checkButtonCount() {
        System.out.println("Total Buttons: " + numberOfButtons);
    }
}
