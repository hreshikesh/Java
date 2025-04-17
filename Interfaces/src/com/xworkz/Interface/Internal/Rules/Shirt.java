package com.xworkz.Interface.Internal.Rules;

public interface Shirt {
    void wearShirt();

    void designShirt();

    void printShirt();

    default void shirtInfo() {
        System.out.println("Shirt information");
    }

}
