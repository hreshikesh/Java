package com.xworkz.runner;

public class PrimeNumber {
    public static void main(String[] args) {
        int value=11;

        boolean flag=true;


        if(value<=1){
            flag= false;
        }

        for(int i=2;i*i<=value;i++){
            if(value%i==0) {
                flag = false;
            }
        }

        if(flag){
            System.out.println("The given Number is primenumber");
        }else System.err.println("The number no not prime");
    }
}
