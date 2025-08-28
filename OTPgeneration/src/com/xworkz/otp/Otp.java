package com.xworkz.otp;

import java.util.Random;
import java.util.Scanner;

public class Otp {

    public static int generateOtp(){
        int a = 0;
        Random random=new Random();
        for (int i = 0; i <6 ; i++) {
            a=random.nextInt(999999);
        }

        return a;
    }



    public static void main(String[] args) {
        int otp=generateOtp();
        System.out.println(otp);

        System.out.println("Enter your otp");
        Scanner scanner=new Scanner(System.in);
        int enteredOtp=scanner.nextInt();
        if(enteredOtp==otp){
            System.out.println("OTP Successfully verified");
        }else System.err.println("OTP not equal");
    }
}
