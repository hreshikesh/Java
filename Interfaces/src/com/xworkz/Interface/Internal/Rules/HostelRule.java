package com.xworkz.Interface.Internal.Rules;

public interface HostelRule {
    void timings();
    void clean();
    void penalty();


    default void hostelInfo() {
        System.out.println("Hostel information");
    }
}
