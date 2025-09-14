package com.xworkz.runner;

public class MultiplyListElement {
    public static void main(String[] args) {
//        Take an array of integers.
//                Multiply each by 10.
//        Keep only numbers greater than 200.
//        Print them and find the average.

        int[] values={1,50,78,90,2,5,3};


        for (int i = 0; i <values.length ; i++) {
            values[i]=values[i]*10;
            if(values[i]>200){
                System.out.println(values[i]);
            }
        }



    }
}
