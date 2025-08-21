package com.xworkz.runner;

public class ReverseArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int rev;
        for (int i=a.length-1;i>=0;i--){
            rev=a[i];
            System.out.println(rev);
        }
    }
}
