package com.xworkz.Interface.Internal.Rules;

public interface Language {
    void speak();

    void write();

    void read();

    default void languageInfo() {
        System.out.println("Language information");
    }

}
