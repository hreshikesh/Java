package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Language;

public class Kannada implements Language {
    @Override
    public void speak() {
        System.out.println("Speaking Kannada");
    }

    @Override
    public void write() {
        System.out.println("Writing in Kannada");
    }

    @Override
    public void read() {
        System.out.println("Reading Kannada");
    }
}
