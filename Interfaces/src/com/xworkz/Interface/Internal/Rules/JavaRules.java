package com.xworkz.Interface.Internal.Rules;

public interface JavaRules {
    void capital();
    void objectName();
    void indentation();


    default void javaInfo() {
        System.out.println("Java information");
    }

}
