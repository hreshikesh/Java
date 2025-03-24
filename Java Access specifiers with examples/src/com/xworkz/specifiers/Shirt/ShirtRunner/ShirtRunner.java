package com.xworkz.specifiers.Shirt.ShirtRunner;
import com.xworkz.specifiers.Shirt.Material.Button;
import com.xworkz.specifiers.Shirt.Material.Fabric;


public class ShirtRunner {
    public static void main(String[] args) {
        Shirt shirt = new Shirt("Raymond", 2500, "M");
        shirt.displayShirtDetails();
        shirt.wearShirt();

        Fabric fabric = new Fabric("Cotton", "Premium", "Blue");
        fabric.fabricDetails();

        Button button = new Button("Plastic", 8, "Round");
        button.buttonDetails(fabric);
    }
}
