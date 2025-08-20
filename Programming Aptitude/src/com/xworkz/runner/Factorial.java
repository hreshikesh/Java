package com.xworkz.runner;

public class Factorial {

    public static int factorial(int num){


        int fact=1;


        if(num==0||num==1){
            return 1;
        }

        for(int i=2;i<=num;i++){
            fact=fact*i;
        }

        return fact;
    }



    public static void main(String[] args) {
        int num=10;
        System.out.println(factorial(num));



    }


}
