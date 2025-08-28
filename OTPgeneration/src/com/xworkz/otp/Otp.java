package com.xworkz.otp;

import java.util.Random;
import java.util.Scanner;

public class Otp {
   private static StringBuilder a=new StringBuilder();
   private static Random random=new Random();
    public static StringBuilder generateOtp(){

        for (int i = 0; i <6 ; i++) {
            a.append(random.nextInt(10));
        }
        return a;
    }



    public static void main(String[] args) {
        StringBuilder otp=generateOtp();
        System.out.println(otp);

        System.out.println("Enter your otp");
        Scanner scanner=new Scanner(System.in);
        StringBuilder enteredOtp= new StringBuilder(scanner.next());
        if(enteredOtp.toString().equals(otp.toString())){
            System.out.println("OTP Successfully verified");
        }else System.err.println("OTP not equal");
    }
}
