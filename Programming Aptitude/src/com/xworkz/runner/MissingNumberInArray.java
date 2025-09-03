package com.xworkz.runner;

public class MissingNumberInArray {
    public static void main(String[] args) {
       int[] a={1,2,3,4,5,6,7,8,9};
       int n=a.length+1;
        System.out.println(n);
       int sumOfArray=0;
       int sumOfLengthOfArray=n*(n+1)/2;
        System.out.println(sumOfLengthOfArray);

        for (int i = 0; i <n-1 ; i++) {
            sumOfArray+=a[i];
        }
        System.out.println(sumOfArray);

        System.out.println("The missing number "+(sumOfLengthOfArray-sumOfArray));

    }
}
