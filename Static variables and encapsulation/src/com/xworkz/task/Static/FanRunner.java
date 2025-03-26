package com.xworkz.task.Static;

public class FanRunner {
    public static void main(String[] args) {
        System.out.println("The speed of fan is "+Fan.speed);
        Fan.speed=110;//updates thenstatic variable
        System.out.println("The speed of fan is "+Fan.speed);

    }
}
