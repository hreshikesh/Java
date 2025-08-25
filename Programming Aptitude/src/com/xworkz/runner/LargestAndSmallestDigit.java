package com.xworkz.runner;

public class LargestAndSmallestDigit {
    public static void main(String[] args) {
        int num=29910752;
        int min=9;
        int max=0;
        int a;
        while(num!=0){
            a=num%10;

            if(a<=min){
                min=a;
            }else if(a>=max){
                max=a;
            }

            num=num/10;
        }
        System.out.println("Max digit "+max);
        System.out.println("min Digit "+min);

    }
}
