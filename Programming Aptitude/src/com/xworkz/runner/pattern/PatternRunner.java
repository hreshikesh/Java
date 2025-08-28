package com.xworkz.runner.pattern;

public class PatternRunner {
    public static void main(String[] args) {
        System.out.println("1.");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("\n");

            
        }


        System.out.println("2.");
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
            
        }


        System.out.println("3.");
        for (int i = 5; i >=0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println("\n");

        }

        System.out.println("4.");
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println("\n");
        }


        System.out.println("5.");
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
        for (int i = 5; i >=1 ; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

    }
}
