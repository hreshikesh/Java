package com.xworkz.runner;

public class GCDandLCM {

    public static int gcd(int a,int b){
        int gcd=1;
        int min=Math.min(a,b);
        for(int i=1;i<min;i++){
            if(a%i==0&&b%i==0){
                gcd=i;
            }
        }

        return gcd;
    }


    public static void main(String[] args) {
        int a=10;
        int b=20;
        int gcdValue=gcd(a,b);
        System.out.println("GCD"+gcdValue);
        System.out.println("LCM"+(a*10)/gcdValue);
    }
}
