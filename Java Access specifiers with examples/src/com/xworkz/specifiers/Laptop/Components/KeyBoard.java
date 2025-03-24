package com.xworkz.specifiers.Laptop.Components;

public class KeyBoard {
    public String keyboardComapny;
    private int noOfKeys;
    String keyoardType;

    public KeyBoard(String keyboardComapny, int noOfKeys, String keyoardType){
        this.keyboardComapny=keyboardComapny;
        this.noOfKeys=noOfKeys;
        this.keyoardType=keyoardType;
    }

    public void keyboardDisplay(Mouse mouse){
        System.out.println("Keyboard Comapny "+this.keyboardComapny);
        System.out.println("Keyboard no of keys"+this.noOfKeys);
        System.out.println("KeyBoard keyboard "+this.keyoardType);
        System.out.println("Keyboard Used along with ");

        mouse.move();


    }
}
