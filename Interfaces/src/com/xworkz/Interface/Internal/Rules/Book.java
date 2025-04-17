package com.xworkz.Interface.Internal.Rules;

public interface Book {
    void readBook();

    void writeBook();

    void publishBook();

    default void bookInfo() {
        System.out.println("Book information");
    }

}
