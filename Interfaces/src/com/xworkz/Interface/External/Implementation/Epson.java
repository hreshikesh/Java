package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Printer;

public class Epson implements Printer {
    @Override
    public void print() {
        System.out.println("Printing from Epson printer");
    }

    @Override
    public void scan() {
        System.out.println("Scanning with Epson printer");
    }

    @Override
    public void copy() {
        System.out.println("Copying with Epson printer");
    }
}
