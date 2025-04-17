package com.xworkz.code.Armstrong;


import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();



        ArmstrongCompute armstrong=new ArmstrongCompute();
        boolean isArmstrong=armstrong.amstrongCompute(no);


        if(isArmstrong){
            System.out.println("Number is armstrong");
        }
        else
            System.out.println("Number is not armstrong");



    }
}
