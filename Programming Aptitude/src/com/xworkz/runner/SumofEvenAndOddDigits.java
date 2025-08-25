package com.xworkz.runner;

public class SumofEvenAndOddDigits {
    public static void main(String[] args) {
        int[] num={2,4,5,3,19,10};
        int evenSum=0;
        int oddSum=0;

        for (int i = 0; i < num.length; i++) {
            if(num[i]%2==0){
                evenSum+=num[i];
            }else oddSum+=num[i];
        }

        System.out.println("Even Sum "+evenSum);
        System.out.println("Odd Sum "+oddSum);

    }
}
