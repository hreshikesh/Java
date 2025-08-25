package com.xworkz.runner;

public class PerfectNumber {
    public static void main(String[] args) {
        int num=28;


        int sum=1;//perfect no sum start from 1

        for(int i=2;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }

        if (sum == num) {

            System.out.println("Perfect Number");
        }else {
            System.out.println("Not perfect number");
        }

    }
}
