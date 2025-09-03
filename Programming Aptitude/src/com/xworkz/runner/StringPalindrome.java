package com.xworkz.runner;

public class StringPalindrome {
    public static void main(String[] args) {
        String name="Google".toLowerCase();

        String rev="";

        for (int i = name.length()-1; i >=0 ; i--) {
            rev=rev+String.valueOf(name.toLowerCase().charAt(i));
        }
        System.out.println(rev);
        if(name.equals(rev)){
            System.out.println("Palindome");
        }else System.out.println("Not palindrome");
    }
}
