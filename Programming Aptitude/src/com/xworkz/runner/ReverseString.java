package com.xworkz.runner;

public class ReverseString {
    public static void main(String[] args) {
        String name="Hreshikesh";
        String reversed="";
        char ch=0;

        for(int i=name.length()-1;i>=0;i--){
            ch=name.charAt(i);
            reversed=reversed+ch;
        }


        System.out.println(reversed);

    }
}
