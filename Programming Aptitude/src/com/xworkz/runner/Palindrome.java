package com.xworkz.runner;

public class Palindrome {
    public static void main(String[] args) {
        int num=101;
        int rev=0;
        int digit;
        int n=num;

        while(num!=0){
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(rev==n){
            System.out.println("palindrome");
        }else System.out.println("not palindrome");
    }
}
