package com.xworkz.runner;

public class DuplicateElements {
    public static void main(String[] args) {
        String element="GoodMorning";

        for (int i = 0; i <element.length() ; i++) {
            char ch=element.charAt(i);
            for (int j = i+1; j <element.length() ; j++) {
             char c=element.charAt(j);

             if (ch==c){
                 System.out.println(ch);
                 break;
             }
            }

        }

    }
}
