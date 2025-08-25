package com.xworkz.runner;

public class MinMax {
    public static void main(String[] args) {
        int a[]={3,4,6,10,9};
        int max=a[0];
        int min=a[0];

        for (int i = 1; i < a.length; i++) {

                if(a[i]>max) max=a[i];
                if(a[i]<min) min=a[i];


        }

        System.out.println("Max number "+max);
        System.out.println("Min number "+min);
    }
}
