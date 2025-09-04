package com.xworkz.runner;

public class SwapVariablesWithoutThirdVariable {
    public static void main(String[] args) {
        int a=0;
        int b=30;

        if(a>b) {
            a = a + b;//30
            b = a - b;//20
            a = a - b;//
        }
        if(a<b){
            b=b+a;//40
            a=b-a;//10
            b=b-a;
        }
        System.out.println(a+" "+b);




    }
}
