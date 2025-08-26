package com.xworkz.runner;
//sum of factorial should be same as the number
public class StrongNumber {
    public static int factorial(int num){
        int n;
        if(num==1||num==0){
            n=1;
        }else{
            int fact=1;
            for(int i=2;i<=num;i++){
                fact*=i;

            }
            n=fact;
        }
        return n;
    }


    public static void main(String[] args) {
        int number=145;
        int temp=number;
        int a;
        int sum=0;
        while(number!=0){
            a=number%10;
            sum+=factorial(a);
            number=number/10;
        }
        if(temp==sum){
            System.out.println("Strong number");
        }else System.out.println("not strong number");



    }
}
