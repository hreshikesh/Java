package com.xworkz.runner;

public class LeapYear {
    public static void main(String[] args) {
        int year=2023;

        if((year%4==0 || year%100==0 || year%400==0)){
            System.out.println("Leap Year");
        }else System.err.println("Not leap Year");
    }
}
