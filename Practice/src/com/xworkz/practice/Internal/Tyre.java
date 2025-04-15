package com.xworkz.practice.Internal;

public class Tyre extends Rubber {
    @Override
    void expand() {
        System.out.println("Running expand in Tyre");
    }
    void compress(){
        System.out.println("Running compress in tyre");
    }
}
