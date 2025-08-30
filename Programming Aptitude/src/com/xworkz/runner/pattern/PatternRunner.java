package com.xworkz.runner.pattern;

import java.util.Arrays;

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
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");

        }


        System.out.println("3.");
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");

        }

        System.out.println("4.");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("\n");
        }


        System.out.println("5.");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }


        System.out.println("6.");

        for (int i = 1; i <=5 ; i++) {
            for (int j = i; j <5 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("\n");

        }

        System.out.println("7.");
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=5 ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        System.out.println("8.");
//        uppertrainglr

        for (int i = 1; i <=4 ; i++) {
            for (int j = i; j <5 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //lowertraingl
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=5 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("9.");

        for (int i = 1; i <=5 ; i++) {
            for (int j = i; j <5 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("10.");
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = (2*i)-1; j<=9 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("11.");
        int num=5;
        for (int i = 1; i <=num ; i++) {
            for (int j = i; j <=num-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j<i ; j++){
                System.out.print(" ");
            }
            for (int j = (2*i)-1; j <=(num*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("12.");
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=num ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <=num ; i++) {
            for (int j = i; j <num ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }


}
