package com.xworkz.Interface.Internal.Rules;

public interface Table {

    void placeItems();
    void clean();
    void fold();

    default void tableInfo() {
        System.out.println("Table information");
    }

}
