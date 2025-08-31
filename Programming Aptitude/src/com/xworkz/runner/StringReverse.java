package com.xworkz.runner;

public class StringReverse {
    public static void main(String[] args) {
        String name="rishi";
        
        String rev = "";
        char ch = 0;
        for (int i = name.length()-1; i >=0 ; i--) {
            ch=name.charAt(i);
            rev= rev+ch;
        }

        System.out.println(rev);
    }
}
