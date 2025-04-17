package com.xworkz.Interface.Internal.Rules;

public interface Chair {
    void sit();
    void stand();
    void recline();

    default void chairInfo() {
        System.out.println("Chair information");
    }
}
