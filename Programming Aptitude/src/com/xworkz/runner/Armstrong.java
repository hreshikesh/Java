package com.xworkz.runner;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ArmstrongCompute armstrong=new ArmstrongCompute();
        boolean isArmstrong=armstrong.amstrongCompute(number);

        if(isArmstrong){
            System.out.println("Number is armstrong");
        }
        else
            System.out.println("Number is not armstrong");

    }
}
