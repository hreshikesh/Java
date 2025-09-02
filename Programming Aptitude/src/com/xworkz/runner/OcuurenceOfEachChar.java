package com.xworkz.runner;

public class OcuurenceOfEachChar {
    public static void main(String[] args) {
        String value="HelloMyBoy";


        for (int i = 0; i <value.length() ; i++) {
            int count =0;
            for (int j = 0; j <value.length() ; j++) {
                if (value.charAt(i)==value.charAt(j)){
                    count++;

                }

            }
            if (value.indexOf(value.charAt(i))==i){
                System.out.println(value.charAt(i)+"="+count);
            }
        }
        
    }
}
