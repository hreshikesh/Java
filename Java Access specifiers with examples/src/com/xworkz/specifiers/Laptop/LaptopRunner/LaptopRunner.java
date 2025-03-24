package com.xworkz.specifiers.Laptop.LaptopRunner;

import com.xworkz.specifiers.Laptop.Components.KeyBoard;
import com.xworkz.specifiers.Laptop.Components.Mouse;

public class LaptopRunner {
    public static void main(String[] args) {
        Mouse mouse=new Mouse("DEll",150,"Virtual");
        mouse.scroll();
        KeyBoard  keyboard=new KeyBoard("Z++",108,"Virtual");
        keyboard.keyboardDisplay(mouse);
        Laptop laptop=new Laptop("i5",50000,"8gb");
        laptop.laptopDisplay();


    }
}
