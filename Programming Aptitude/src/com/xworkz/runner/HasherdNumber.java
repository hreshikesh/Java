package com.xworkz.runner;

public class HasherdNumber {
    public static void main(String[] args) {
        int num=10;
        int n=num;
        int sum=0;
        int a;


        while(num!=0){
            a=num%10;
            sum+=a;
            num=num/10;
        }


        if(n%sum==0){
            System.out.println("Hasherd Number");
        }else System.out.println("not hasherd number");
    }
}
