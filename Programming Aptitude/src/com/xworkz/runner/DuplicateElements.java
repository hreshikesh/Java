package com.xworkz.runner;

public class DuplicateElements {
    public static void main(String[] args) {
        String element="GoodMorning";
        String converted=element.toLowerCase();
        System.out.println(converted);
        for (int i = 0; i <converted.length() ; i++) {
            char ch=converted.charAt(i);
            for (int j = i+1; j <converted.length() ; j++) {
             if (converted.indexOf(ch)==converted.lastIndexOf(ch)){
                 System.out.println(ch);
                 break;
             }
            }

        }

    }
}
